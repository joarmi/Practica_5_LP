
//----------------------------------------------------
// The following code was generated by CUP v0.11a beta 20060608
// Wed Dec 14 15:35:16 CET 2016
//----------------------------------------------------

package MIPS;

import java_cup.runtime.*;
import java.io.*;
import java.util.*;

/** CUP v0.11a beta 20060608 generated parser.
  * @version Wed Dec 14 15:35:16 CET 2016
  */
public class parser extends java_cup.runtime.lr_parser {

  /** Default constructor. */
  public parser() {super();}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\020\000\002\002\004\000\002\002\004\000\002\002" +
    "\003\000\002\003\004\000\002\003\003\000\002\004\005" +
    "\000\002\004\005\000\002\004\005\000\002\004\005\000" +
    "\002\004\003\000\002\004\003\000\002\004\005\000\002" +
    "\004\004\000\002\004\004\000\002\004\004\000\002\004" +
    "\005" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\035\000\020\003\010\004\007\005\006\013\012\014" +
    "\005\017\014\020\015\001\002\000\022\002\036\003\010" +
    "\004\007\005\006\013\012\014\005\017\014\020\015\001" +
    "\002\000\016\004\007\005\006\013\012\014\005\017\014" +
    "\020\015\001\002\000\004\017\033\001\002\000\004\017" +
    "\032\001\002\000\022\002\ufffd\003\ufffd\004\ufffd\005\ufffd" +
    "\013\ufffd\014\ufffd\017\ufffd\020\ufffd\001\002\000\014\006" +
    "\031\010\021\011\023\012\022\013\020\001\002\000\016" +
    "\004\007\005\006\013\012\014\005\017\014\020\015\001" +
    "\002\000\022\002\uffff\003\uffff\004\uffff\005\uffff\013\uffff" +
    "\014\uffff\017\uffff\020\uffff\001\002\000\020\006\ufff7\007" +
    "\016\010\ufff7\011\ufff7\012\ufff7\013\ufff7\015\ufff7\001\002" +
    "\000\016\006\ufff8\010\ufff8\011\ufff8\012\ufff8\013\ufff8\015" +
    "\ufff8\001\002\000\016\004\007\005\006\013\012\014\005" +
    "\017\014\020\015\001\002\000\016\006\ufff2\010\021\011" +
    "\023\012\022\013\020\015\ufff2\001\002\000\016\004\007" +
    "\005\006\013\012\014\005\017\014\020\015\001\002\000" +
    "\016\004\007\005\006\013\012\014\005\017\014\020\015" +
    "\001\002\000\016\004\007\005\006\013\012\014\005\017" +
    "\014\020\015\001\002\000\016\004\007\005\006\013\012" +
    "\014\005\017\014\020\015\001\002\000\016\006\ufff9\010" +
    "\ufff9\011\ufff9\012\ufff9\013\ufff9\015\ufff9\001\002\000\016" +
    "\006\ufffc\010\021\011\023\012\ufffc\013\ufffc\015\ufffc\001" +
    "\002\000\016\006\ufffa\010\ufffa\011\ufffa\012\ufffa\013\ufffa" +
    "\015\ufffa\001\002\000\016\006\ufffb\010\021\011\023\012" +
    "\ufffb\013\ufffb\015\ufffb\001\002\000\016\006\ufff5\010\ufff5" +
    "\011\ufff5\012\ufff5\013\ufff5\015\ufff5\001\002\000\022\002" +
    "\ufffe\003\ufffe\004\ufffe\005\ufffe\013\ufffe\014\ufffe\017\ufffe" +
    "\020\ufffe\001\002\000\016\006\ufff4\010\ufff4\011\ufff4\012" +
    "\ufff4\013\ufff4\015\ufff4\001\002\000\016\006\ufff3\010\ufff3" +
    "\011\ufff3\012\ufff3\013\ufff3\015\ufff3\001\002\000\014\010" +
    "\021\011\023\012\022\013\020\015\035\001\002\000\016" +
    "\006\ufff6\010\ufff6\011\ufff6\012\ufff6\013\ufff6\015\ufff6\001" +
    "\002\000\004\002\000\001\002\000\022\002\001\003\001" +
    "\004\001\005\001\013\001\014\001\017\001\020\001\001" +
    "\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\035\000\010\002\003\003\012\004\010\001\001\000" +
    "\006\003\036\004\010\001\001\000\004\004\033\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\004\004\027\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\004\016\001" +
    "\001\000\002\001\001\000\004\004\026\001\001\000\004" +
    "\004\025\001\001\000\004\004\024\001\001\000\004\004" +
    "\023\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 1;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}




public static void main(String[] arg){     
    if (arg.length!=1)       
        System.out.println("Debe dar el nombre del fichero de entrada como parámetro");     
    else     
    {          
        String fileName=arg[0];          
        LexicalAnalyzerMIPS miAnalizadorLexico=null;          
        parser parserObj=null;          
        Symbol x=null;                    

        try{            
            miAnalizadorLexico =             
                new LexicalAnalyzerMIPS(new InputStreamReader(new FileInputStream(fileName)));
        
        } catch (IOException e){            
            System.err.println("Fichero de entrada "+fileName+" no encontrado");            
            System.exit(0);          
        }          
        try{             
            parserObj = new parser(miAnalizadorLexico);             
            x=parserObj.parse();          
        } catch (Exception e) {             
            System.err.println("No se pudo inicializar el compilador");             
            System.exit(0);          
        }       
    } // end else 
} 

}

/** Cup generated class to encapsulate user supplied action code.*/
class CUP$parser$actions {


    Vector elementos = new Vector();
    boolean todo_bien = true;
    boolean contenido = false;
    boolean asignacion = true;

  private final parser parser;

  /** Constructor */
  CUP$parser$actions(parser parser) {
    this.parser = parser;
  }

  /** Method with the actual generated action code. */
  public final java_cup.runtime.Symbol CUP$parser$do_action(
    int                        CUP$parser$act_num,
    java_cup.runtime.lr_parser CUP$parser$parser,
    java.util.Stack            CUP$parser$stack,
    int                        CUP$parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$parser$result;

      /* select the action based on the action number */
      switch (CUP$parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // operacion ::= VARIABLE_VALIDA ASIGNACION operacion 
            {
              Integer RESULT =null;
		int v4left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int v4right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Object v4 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		if(!asignacion){
                    System.err.println("La variable " + v4 + " no ha sido inicializada, erro fila " + v4left + " columna " + v4right);
                    asignacion = true;
                }
                else if(!todo_bien){
                    System.err.println("La variable " + v4 + " no ha sido inicializada, erro fila " + v4left + " columna " + v4right);
                    todo_bien = true;
                }
                else{
                    elementos.addElement(v4);
                    System.out.println("Se ha asignado correctamente el valor a la variable " + v4);
                } 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("operacion",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // operacion ::= MOSTRAR VARIABLE_VALIDA 
            {
              Integer RESULT =null;
		int v2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int v2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object v2 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		contenido = elementos.contains(v2);

              if(contenido)
                System.out.println("Se ha mostrado correctamente la variable " + v2);
              else
                System.err.println("La variable " + v2 + " no ha sido inicializada, erro fila " + v2left + " columna " + v2right); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("operacion",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // operacion ::= LEER VARIABLE_VALIDA 
            {
              Integer RESULT =null;
		int v1left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int v1right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object v1 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		System.out.println("Se ha leido correctamente la variable " + v1);
              elementos.addElement(v1); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("operacion",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // operacion ::= RESTA operacion 
            {
              Integer RESULT =null;
		int op1left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int op1right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer op1 = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("operacion",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // operacion ::= PAR_ABIERTO operacion PAR_CERRADO 
            {
              Integer RESULT =null;
		if(todo_bien){
                    System.out.println("Se ha detectado parentesis");
                    todo_bien = true;
                } 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("operacion",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // operacion ::= VARIABLE_VALIDA 
            {
              Integer RESULT =null;
		int v3left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int v3right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object v3 = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		contenido = elementos.contains(v3);

              if(!contenido){
              System.err.println("La variable " + v3 + " no ha sido inicializada, erro fila " + v3left + " columna " + v3right);
              todo_bien = false;
              }
              CUP$parser$result = parser.getSymbolFactory().newSymbol("operacion",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // operacion ::= INTEGER_LITERAL 
            {
              Integer RESULT =null;
		int ileft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int iright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer i = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("operacion",2, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // operacion ::= operacion DIVISION operacion 
            {
              Integer RESULT =null;
		int op7left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int op7right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Integer op7 = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int op8left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int op8right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer op8 = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		if(todo_bien)
                    System.out.println("Se ha dividido correctamente");
                else{
                    todo_bien = true;
                    asignacion = false;
                } 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("operacion",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // operacion ::= operacion MULTIPLICACION operacion 
            {
              Integer RESULT =null;
		int op5left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int op5right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Integer op5 = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int op6left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int op6right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer op6 = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		if(todo_bien)
                    System.out.println("Se ha multiplicado correctamente");
                else{
                    todo_bien = true;
                    asignacion = false;
                } 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("operacion",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // operacion ::= operacion RESTA operacion 
            {
              Integer RESULT =null;
		int op3left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int op3right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Integer op3 = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int op4left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int op4right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer op4 = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		if(todo_bien)
                    System.out.println("Se ha restado correctamente");
                else{
                    todo_bien = true;
                    asignacion = false;
                } 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("operacion",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // operacion ::= operacion SUMA operacion 
            {
              Integer RESULT =null;
		int op1left = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).left;
		int op1right = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)).right;
		Integer op1 = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-2)).value;
		int op2left = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int op2right = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Integer op2 = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		if(todo_bien)
                    System.out.println("Se ha sumado correctamente");
                else{
                    todo_bien = true;
                    asignacion = false;
                } 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("operacion",2, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-2)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // expr_part ::= error 
            {
              Object RESULT =null;
		int errleft = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).left;
		int errright = ((java_cup.runtime.Symbol)CUP$parser$stack.peek()).right;
		Object err = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.peek()).value;
		System.err.println("Error sintactica, falta un punto y coma o un parentesis, linea " + errleft + " columna " + errright); 
              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr_part",1, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // expr_part ::= operacion PUNTO_COMA 
            {
              Object RESULT =null;
		int opleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int opright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Integer op = (Integer)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr_part",1, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // expr_list ::= expr_part 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr_list",0, ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // $START ::= expr_list EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)).right;
		Object start_val = (Object)((java_cup.runtime.Symbol) CUP$parser$stack.elementAt(CUP$parser$top-1)).value;
		RESULT = start_val;
              CUP$parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$parser$parser.done_parsing();
          return CUP$parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // expr_list ::= expr_list expr_part 
            {
              Object RESULT =null;

              CUP$parser$result = parser.getSymbolFactory().newSymbol("expr_list",0, ((java_cup.runtime.Symbol)CUP$parser$stack.elementAt(CUP$parser$top-1)), ((java_cup.runtime.Symbol)CUP$parser$stack.peek()), RESULT);
            }
          return CUP$parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number found in internal parse table");

        }
    }
}

