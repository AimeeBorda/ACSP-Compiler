import java.util.*;

public class Environment {

    private final HashMap<String, Environment> locMap;
    private HashSet<String> in = new HashSet<>();
    private HashSet<String> out = new HashSet<>();
    private HashSet<String> callDependency = new HashSet<>();

    public Environment(HashMap<String, Environment> locMap) {
        this.locMap = locMap;
    }


    public Environment in(String loc){
        in.add(loc);
        return this;
    }

    public void removeAllIn(HashSet<String> loc){
        in.removeAll(loc);
    }

    public void removeAllOut(HashSet<String> prefixes) {
        out.removeAll(prefixes);
    }

    public Environment out(String loc){
        out.add(loc);
        return this;
    }

    public Environment call(String proc){
        callDependency.add(proc);
        return this;
    }

    public Environment merge(Environment e){
        Environment env = new Environment(this.locMap);

        env.in.addAll(in);
        env.in.addAll(e.in);

        env.out.addAll(out);
        env.out.addAll(e.out);

        env.callDependency.addAll(callDependency);
        env.callDependency.addAll(e.callDependency);

        return env;
    }


    public Environment diff(Environment e){
        Environment env = new Environment(this.locMap);

        env.in.addAll(in);
        env.in.removeAll(e.in);

        env.out.addAll(out);
        env.out.removeAll(e.out);

        env.callDependency.addAll(callDependency);
        env.callDependency.removeAll(e.callDependency);

        return env;
    }

    public boolean isEmpty(){
        return locations().isEmpty() && prefixes().isEmpty();
    }


    public HashSet<String> locations(){
        HashSet<String> s = new HashSet<>(callDependency);

        HashSet<String> res = new HashSet<>(in);
        while(!s.isEmpty()){
            ArrayList<String> iterator = new ArrayList<>(s);
            s.clear();
            for(String next : iterator){
                if(locMap.containsKey(next)){
                    Environment env = locMap.get(next);
                    s.addAll(env.callDependency);
                    res.addAll(env.in);
                }
            }
        }

        return res;
    }

    public HashSet<String> prefixes(){
        HashSet<String> s = new HashSet<>(callDependency);

        HashSet<String> res = new HashSet<>(out);
        while(!s.isEmpty()){
            ArrayList<String> iterator = new ArrayList<>(s);
            s.clear();
            for(String next : iterator){
                if(locMap.containsKey(next)){
                    Environment env = locMap.get(next);
                    s.addAll(env.callDependency);
                    res.addAll(env.out);
                }
            }
        }

        return res;
    }


}
