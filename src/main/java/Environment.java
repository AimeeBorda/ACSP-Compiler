import java.util.*;

import static java.util.stream.Collectors.toList;

public class Environment {

    private final HashMap<String, Environment> locMap;
    private HashSet<String> in = new HashSet<>();
    private HashSet<String> out = new HashSet<>();
    private HashSet<String> callDependency = new HashSet<>();
    private HashSet<String> bound = new HashSet<>();

    public Environment(HashMap<String, Environment> locMap) {
        this.locMap = locMap;
    }


    public Environment in(String loc) {
        in.add(loc);
        return this;
    }

    public Environment bound(String loc) {
        bound.add(loc);
        return this;
    }

    public void removeAllIn(HashSet<String> loc) {
        in.removeAll(loc);
    }

    public void removeAllOut(HashSet<String> prefixes) {
        out.removeAll(prefixes);
    }

    public Environment out(String loc) {
        out.add(loc);
        return this;
    }

    public Environment call(String proc) {
        callDependency.add(proc);
        return this;
    }

    public Environment merge(Environment e) {
        Environment env = new Environment(this.locMap);

        env.in.addAll(in);
        env.in.addAll(e.in);

        env.out.addAll(out);
        env.out.addAll(e.out);

        env.callDependency.addAll(callDependency);
        env.callDependency.addAll(e.callDependency);

        env.bound.addAll(bound);
        env.bound.addAll(e.bound);

        return env;
    }


    public Environment diff(Environment e) {
        Environment env = new Environment(this.locMap);

        env.in.addAll(in);
        env.in.removeAll(e.in);

        env.out.addAll(out);
        env.out.removeAll(e.out);

        env.bound.addAll(bound);
        env.bound.removeAll(e.bound);

        return env;
    }

    public boolean isEmpty() {
        return locations().isEmpty() && prefixes().isEmpty();
    }

    public Stack<String> getCallGraph() {
        Stack<String> callGraph = new Stack<>();
        callGraph.addAll(callDependency);
        Stack<String> res = new Stack<>();

        while (!callGraph.isEmpty()) {
            String proc = callGraph.pop();

            if (locMap.containsKey(proc)) {
                res.push(proc);
                Environment env = locMap.get(proc);
                callGraph.addAll(env.callDependency.stream().filter(c -> !res.contains(c)).collect(toList()));
            }
        }

        return res;
    }


    public HashSet<String> locations() {
        HashSet<String> res = new HashSet<>();
        Stack<String> callGraph = getCallGraph();
        HashMap<String,Boolean> memo = new HashMap<>();

        while(!callGraph.isEmpty()){
            String next = callGraph.pop();
            if (!memo.containsKey(next) && locMap.containsKey(next)) {
                Environment env = locMap.get(next);
                res.addAll(env.in);
                res.removeAll(env.bound);

                memo.put(next,true);
            }
        }

        res.addAll(in);
        res.removeAll(bound);

        return res;
    }

    public HashSet<String> prefixes() {
        HashSet<String> res = new HashSet<>();
        Stack<String> callGraph = getCallGraph();
        HashMap<String,Boolean> memo = new HashMap<>();

        while(!callGraph.isEmpty()){
            String next = callGraph.pop();
            if (!memo.containsKey(next) && locMap.containsKey(next)) {
                Environment env = locMap.get(next);
                res.addAll(env.out);
                res.removeAll(env.bound);

                memo.put(next,true);
            }
        }

        res.addAll(out);
        res.removeAll(bound);

        return res;
    }


}
