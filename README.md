# ACSP-Compiler
A compiler from A-CSP to CSP integrated with the FDR API.

  Prerequisite:
- FDR
- Antlr
- Maven
- Java 8 

## Setup
Translation is the main class which takes as arguments the input file name. It produces a temp.csp file containing the translation and opens FDR with temp.csp. Any errors will be shown on the console.

## Example
The folder example has two case-studies: Art Gallery and Smart Stadium. These case-studies were used as part of the Evaluation of a thesis approach.
