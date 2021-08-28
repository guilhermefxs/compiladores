package br.ufpe.cin.if688.minijava.util;

public class Programs {
    public final static String input1 = "class UltimateCode {\n" +
            "    public static void main(String[] a) {\n" +
            "\t    System.out.println((new Ball()).bounce(42));\n" +
            "    }\n" +
            "}\n" +
            "\n" +
            "class Ball {\n" +
            "    public int bounce(int speed) {\n" +
            "       int[] array;\n" +
            "       int integer;\n" +
            "       boolean bool;\n" +
            "\n" +
            "       integer = 10 * speed;\n" +
            "       array[0] = integer;\n" +
            "       bool = true;\n" +
            "\n" +
            "       while (integer) {\n" +
            "        System.out.println(12);\n" +
            "       }\n" +
            "\n" +
            "       return integer;\n" +
            "    }\n" +
            "}";

    public final static String outputSymbolTable1 = "SymbolTable [\n" +
            "    Class Ball\n" +
            "    Class UltimateCode\n" +
            "]\n";

    public final static String outputTypeChecker1 = "Couldn't match expected type 'BooleanType' with actual type 'IntegerType'";

    public final static String input2 = "class UltimateCode {\n" +
            "    public static void main(String[] a) {\n" +
            "\t    System.out.println((new Ball()).bounce(42, 12));\n" +
            "    }\n" +
            "}\n" +
            "class Ball {\n" +
            "    public int bounce(int speed) {\n" +
            "       int resultSpeed;\n" +
            "       resultSpeed = 10 * speed;\n" +
            "       return resultSpeed;\n" +
            "    }\n" +
            "}\n" +
            "\n" +
            "class TennisBall extends Bal {\n" +
            "    public int bounce(int speed) {\n" +
            "        int resultSpeed;\n" +
            "        resultSpeed = 15 * speed;\n" +
            "        return resultSpeed;\n" +
            "    }\n" +
            "}\n";
    public final static String outputSymbolTable2 =
            "SymbolTable [\n" +
                    "    Class TennisBall\n" +
                    "    Class Ball\n" +
                    "    Class UltimateCode\n" +
                    "]\n";

    public final static String outputTypeChecker2 = "Method 'bounce' call has too many arguments";

    public final static String input3 = "class UltimateCode {\n" +
            "    public static void main(String[] a) {\n" +
            "\t    System.out.println((new Ball()).bounce());\n" +
            "    }\n" +
            "}\n" +
            "class Ball {\n" +
            "    public int bounce(int speed) {\n" +
            "       int resultSpeed;\n" +
            "       resultSpeed = 10 * speed;\n" +
            "       return resultSpeed;\n" +
            "    }\n" +
            "}\n" +
            "\n" +
            "class TennisBall extends Bal {\n" +
            "    public int bounce(int speed) {\n" +
            "        int resultSpeed;\n" +
            "        resultSpeed = 15 * speed;\n" +
            "        return resultSpeed;\n" +
            "    }\n" +
            "}";
    public final static String outputSymbolTable3 = "SymbolTable [\n" +
            "    Class TennisBall\n" +
            "    Class Ball\n" +
            "    Class UltimateCode\n" +
            "]\n";
    public final static String outputTypeChecker3 = "Method 'bounce' call has too few arguments";

    public final static String input4 = "class LinkedList{\n" +
            "    public static void main(String[] a){\n" +
            "\tSystem.out.println(new LL().Start());\n" +
            "    }\n" +
            "}\n" +
            "\n" +
            "class Element {\n" +
            "    int Age ;\n" +
            "    int Salary ;\n" +
            "    boolean Married ;\n" +
            "\n" +
            "    // Initialize some class variables\n" +
            "    public boolean Init(int v_Age, int v_Salary, boolean v_Married){\n" +
            "\tAge = v_Age ;\n" +
            "\tSalary = v_Salary ;\n" +
            "\tMarried = v_Married ;\n" +
            "\treturn true ;\n" +
            "    }\n" +
            "\n" +
            "    public int GetAge(){\n" +
            "\treturn Age ;\n" +
            "    }\n" +
            "\n" +
            "    public int GetSalary(){\n" +
            "\treturn Salary ;\n" +
            "    }\n" +
            "\n" +
            "    public boolean GetMarried(){\n" +
            "\treturn Married ;\n" +
            "    }\n" +
            "\n" +
            "    // This method returns true if the object \"other\"\n" +
            "    // has the same values for age, salary and\n" +
            "    public boolean Equal(Element other){\n" +
            "\tboolean ret_val ;\n" +
            "\tint aux01 ;\n" +
            "\tint aux02 ;\n" +
            "\tint nt ;\n" +
            "\tret_val = true ;\n" +
            "\n" +
            "\taux01 = other.GetAge();\n" +
            "\tif (!this.Compare(aux01,Age)) ret_val = false ;\n" +
            "\telse {\n" +
            "\t    aux02 = other.GetSalary();\n" +
            "\t    if (!this.Compare(aux02,Salary)) ret_val = false ;\n" +
            "\t    else\n" +
            "\t\tif (Married)\n" +
            "\t\t    if (!other.GetMarried()) ret_val = false;\n" +
            "\t\t    else nt = 0 ;\n" +
            "\t\telse\n" +
            "\t\t    if (other.GetMarried()) ret_val = false;\n" +
            "\t\t    else nt = 0 ;\n" +
            "\t}\n" +
            "\n" +
            "\treturn ret_val ;\n" +
            "    }\n" +
            "\n" +
            "    // This method compares two integers and\n" +
            "    // returns true if they are equal and false\n" +
            "    // otherwise\n" +
            "    public boolean Compare(int num1 , int num2){\n" +
            "\tboolean retval ;\n" +
            "\tint aux02 ;\n" +
            "\tretval = false ;\n" +
            "\taux02 = num2 + 1 ;\n" +
            "\tif (num1 < num2) retval = false ;\n" +
            "\telse if (!(num1 < aux02)) retval = false ;\n" +
            "\telse retval = true ;\n" +
            "\treturn retval ;\n" +
            "    }\n" +
            "\n" +
            "}\n" +
            "\n" +
            "class List{\n" +
            "    Element elem ;\n" +
            "    List next ;\n" +
            "    boolean end ;\n" +
            "\n" +
            "    // Initialize the node list as the last node\n" +
            "    public boolean Init(){\n" +
            "\tend = true ;\n" +
            "\treturn true ;\n" +
            "    }\n" +
            "\n" +
            "    // Initialize the values of a new node\n" +
            "    public boolean InitNew(Element v_elem, List v_next, boolean v_end){\n" +
            "\tend = v_end ;\n" +
            "\telem = v_elem ;\n" +
            "\tnext = v_next ;\n" +
            "\treturn true ;\n" +
            "    }\n" +
            "\n" +
            "    // Insert a new node at the beginning of the list\n" +
            "    public List Insert(Element new_elem){\n" +
            "\tboolean ret_val ;\n" +
            "\tList aux03 ;\n" +
            "\tList aux02 ;\n" +
            "\taux03 = this ;\n" +
            "\taux02 = new List();\n" +
            "\tret_val = aux02.InitNew(new_elem,aux03,false);\n" +
            "\treturn aux02 ;\n" +
            "    }\n" +
            "\n" +
            "\n" +
            "    // Update the the pointer to the next node\n" +
            "    public boolean SetNext(List v_next){\n" +
            "\tnext = v_next ;\n" +
            "\treturn true ;\n" +
            "    }\n" +
            "\n" +
            "    // Delete an element e from the list\n" +
            "    public List Delete(Element e){\n" +
            "\tList my_head ;\n" +
            "\tboolean ret_val ;\n" +
            "\tboolean aux05;\n" +
            "\tList aux01 ;\n" +
            "\tList prev ;\n" +
            "\tboolean var_end ;\n" +
            "\tElement var_elem ;\n" +
            "\tint aux04 ;\n" +
            "\tint nt ;\n" +
            "\n" +
            "\n" +
            "\tmy_head = this ;\n" +
            "\tret_val = false ;\n" +
            "\taux04 = 0 - 1 ;\n" +
            "\taux01 = this ;\n" +
            "\tprev = this ;\n" +
            "\tvar_end = end;\n" +
            "\tvar_elem = elem ;\n" +
            "\twhile ((!var_end) && (!ret_val)){\n" +
            "\t    if (e.Equal(var_elem)){\n" +
            "\t\tret_val = true ;\n" +
            "\t\tif (aux04 < 0) {\n" +
            "\t\t    // delete first element\n" +
            "\t\t    my_head = aux01.GetNext() ;\n" +
            "\t\t}\n" +
            "\t\telse{ // delete a non first element\n" +
            "\t\t    System.out.println(0-555);\n" +
            "\t\t    aux05 = prev.SetNext(aux01.GetNext());\n" +
            "\t\t    System.out.println(0-555);\n" +
            "\n" +
            "\t\t}\n" +
            "\t    } else nt = 0 ;\n" +
            "\t    if (!ret_val){\n" +
            "\t\tprev = aux01 ;\n" +
            "\t\taux01 = aux01.GetNext() ;\n" +
            "\t\tvar_end = aux01.GetEnd();\n" +
            "\t\tvar_elem = aux01.GetElem();\n" +
            "\t\taux04 = 1 ;\n" +
            "\t    } else nt = 0 ;\n" +
            "\t}\n" +
            "\treturn my_head ;\n" +
            "    }\n" +
            "\n" +
            "\n" +
            "    // Search for an element e on the list\n" +
            "    public int Search(Element e){\n" +
            "\tint int_ret_val ;\n" +
            "\tList aux01 ;\n" +
            "\tElement var_elem ;\n" +
            "\tboolean var_end ;\n" +
            "\tint nt ;\n" +
            "\n" +
            "\tint_ret_val = 0 ;\n" +
            "\taux01 = this ;\n" +
            "\tvar_end = end;\n" +
            "\tvar_elem = elem ;\n" +
            "\twhile (!var_end){\n" +
            "\t    if (e.Equal(var_elem)){\n" +
            "\t\tint_ret_val = 1 ;\n" +
            "\t    }\n" +
            "\t    else nt = 0 ;\n" +
            "\t    aux01 = aux01.GetNext() ;\n" +
            "\t    var_end = aux01.GetEnd();\n" +
            "\t    var_elem = aux01.GetElem();\n" +
            "\t}\n" +
            "\treturn int_ret_val ;\n" +
            "    }\n" +
            "\n" +
            "    public boolean GetEnd(){\n" +
            "\treturn end ;\n" +
            "    }\n" +
            "\n" +
            "    public Element GetElem(){\n" +
            "\treturn elem ;\n" +
            "    }\n" +
            "\n" +
            "    public List GetNext(){\n" +
            "\treturn next ;\n" +
            "    }\n" +
            "\n" +
            "\n" +
            "    // Print the linked list\n" +
            "    public boolean Print(){\n" +
            "\tList aux01 ;\n" +
            "\tboolean var_end ;\n" +
            "\tElement  var_elem ;\n" +
            "\n" +
            "\taux01 = this ;\n" +
            "\tvar_end = end ;\n" +
            "\tvar_elem = elem ;\n" +
            "\twhile (!var_end){\n" +
            "\t    System.out.println(var_elem.GetAge());\n" +
            "\t    aux01 = aux01.GetNext() ;\n" +
            "\t    var_end = aux01.GetEnd();\n" +
            "\t    var_elem = aux01.GetElem();\n" +
            "\t}\n" +
            "\n" +
            "\treturn true ;\n" +
            "    }\n" +
            "}\n" +
            "\n" +
            "\n" +
            "// this class invokes the methods to insert, delete,\n" +
            "// search and print the linked list\n" +
            "class LL{\n" +
            "\n" +
            "    public int Start(){\n" +
            "\n" +
            "\tList head ;\n" +
            "\tList last_elem ;\n" +
            "\tboolean aux01 ;\n" +
            "\tElement el01 ;\n" +
            "\tElement el02 ;\n" +
            "\tElement el03 ;\n" +
            "\n" +
            "\tlast_elem = new List();\n" +
            "\taux01 = last_elem.Init();\n" +
            "\thead = last_elem ;\n" +
            "\taux01 = head.Init();\n" +
            "\taux01 = head.Print();\n" +
            "\n" +
            "\t// inserting first element\n" +
            "\tel01 = new Element();\n" +
            "\taux01 = el01.Init(25,37000,false);\n" +
            "\thead = head.Insert(el01);\n" +
            "\taux01 = head.Print();\n" +
            "\tSystem.out.println(10000000);\n" +
            "\t// inserting second  element\n" +
            "\tel01 = new Element();\n" +
            "\taux01 = el01.Init(39,42000,true);\n" +
            "\tel02 = el01 ;\n" +
            "\thead = head.Insert(el01);\n" +
            "\taux01 = head.Print();\n" +
            "\tSystem.out.println(10000000);\n" +
            "\t// inserting third element\n" +
            "\tel01 = new Element();\n" +
            "\taux01 = el01.Init(22,34000,false);\n" +
            "\thead = head.Insert(el01);\n" +
            "\taux01 = head.Print();\n" +
            "\tel03 = new Element();\n" +
            "\taux01 = el03.Init(27,34000,false);\n" +
            "\tSystem.out.println(head.Search(el02));\n" +
            "\tSystem.out.println(head.Search(el03));\n" +
            "\tSystem.out.println(10000000);\n" +
            "\t// inserting fourth element\n" +
            "\tel01 = new Element();\n" +
            "\taux01 = el01.Init(28,35000,false);\n" +
            "\thead = head.Insert(el01);\n" +
            "\taux01 = head.Print();\n" +
            "\tSystem.out.println(2220000);\n" +
            "\n" +
            "\thead = head.Delete(el02);\n" +
            "\taux01 = head.Print();\n" +
            "\tSystem.out.println(33300000);\n" +
            "\n" +
            "\n" +
            "\thead = head.Delete(el01);\n" +
            "\taux01 = head.Print();\n" +
            "\tSystem.out.println(44440000);\n" +
            "\n" +
            "\treturn 0 ;\n" +
            "    }\n" +
            "\n" +
            "}\n";
    public final static String outputSymbolTable4 = "SymbolTable [\n" +
            "    Class Element\n" +
            "    Class List\n" +
            "    Class LinkedList\n" +
            "    Class LL\n" +
            "]\n";

    public final static String input5 = "class UltimateCode {\n" +
            "    public static void main(String[] a) {\n" +
            "\t    System.out.println((new Ball()).teleport(42));\n" +
            "    }\n" +
            "}\n" +
            "class Ball {\n" +
            "    public int bounce(int speed) {\n" +
            "       int resultSpeed;\n" +
            "       resultSpeed = 10 * speed;\n" +
            "       return resultSpeed;\n" +
            "    }\n" +
            "}\n" +
            "\n" +
            "class TennisBall extends Ball {\n" +
            "    public int bounce(int speed) {\n" +
            "        int resultSpeed;\n" +
            "        resultSpeed = 15 * speed;\n" +
            "        return resultSpeed;\n" +
            "    }\n" +
            "}\n";
    public final static String outputSymbolTable5 = "SymbolTable [\n" +
            "    Class TennisBall\n" +
            "    Class Ball\n" +
            "    Class UltimateCode\n" +
            "]\n";
    public final static String outputTypeChecker5 = "Identifier 'teleport' could not be found";

    public final static String input6 = "class UltimateCode {\n" +
            "    public static void main(String[] a) {\n" +
            "\t    System.out.println(12);\n" +
            "    }\n" +
            "}\n" +
            "\n" +
            "// ################ new Class\n" +
            "class Ball {\n" +
            "    public int bounce(int speed) {\n" +
            "       int resultSpeed;\n" +
            "       resultSpeed = 10 * speed;\n" +
            "       return resultSpeed;\n" +
            "    }\n" +
            "}\n" +
            "\n" +
            "class TennisBall extends Bal {\n" +
            "    public int bounce(int speed) {\n" +
            "        int resultSpeed;\n" +
            "        resultSpeed = 15 * speed;\n" +
            "        return resultSpeed;\n" +
            "    }\n" +
            "}\n";
    public final static String outputSymbolTable6 = "SymbolTable [\n" +
            "    Class TennisBall\n" +
            "    Class Ball\n" +
            "    Class UltimateCode\n" +
            "]\n";
    public final static String outputTypeChecker6 = "Identifier 'Bal' could not be found";

    public final static String input7 = "class UltimateCode {\n" +
            "    public static void main(String[] a) {\n" +
            "\t    System.out.println((new Ball()).bounce(42));\n" +
            "    }\n" +
            "}\n" +
            "\n" +
            "class Ball {\n" +
            "    public int bounce(int speed) {\n" +
            "       int[] array;\n" +
            "       int integer;\n" +
            "       boolean bool;\n" +
            "       array[0] = integer;\n" +
            "       integer = 21;\n" +
            "       bool = true;\n" +
            "\n" +
            "       if (10 * 2 < array.length - array[0]) {\n" +
            "        integer = 42;\n" +
            "       }\n" +
            "       else {\n" +
            "        integer = 9000;\n" +
            "       }\n" +
            "\n" +
            "       return integer;\n" +
            "    }\n" +
            "    public int double(int shape, int shape) {\n" +
            "        return 2 * shape;\n" +
            "    }\n" +
            "}\n";
    public final static String outputSymbolTable7 = "The parameter 'shape' was already declared!";

    public final static String input8 = "class UltimateCode {\n" +
            "    public static void main(String[] a) {\n" +
            "\t    System.out.println((new Ball()).bounce(42));\n" +
            "    }\n" +
            "}\n" +
            "\n" +
            "class Ball {\n" +
            "    public int bounce(int speed) {\n" +
            "       int[] array;\n" +
            "       int integer;\n" +
            "       boolean bool;\n" +
            "       array[0] = integer;\n" +
            "       integer = 21;\n" +
            "       bool = true;\n" +
            "\n" +
            "       if (10 * 2 < array.length - array[0]) {\n" +
            "        integer = 42;\n" +
            "       }\n" +
            "       else {\n" +
            "        integer = 9000;\n" +
            "       }\n" +
            "\n" +
            "       return integer;\n" +
            "    }\n" +
            "}\n" +
            "class Ball {\n" +
            "    public int bounce(int speed) {\n" +
            "        return speed;\n" +
            "    }\n" +
            "}\n";
    public final static String outputSymbolTable8 = "The class 'Ball' was already declared!";

    public final static String input9 = "class Factorial{\n" +
            "    public static void main(String[] a){\n" +
            "\tSystem.out.println(new Fac().ComputeFac(10));\n" +
            "    }\n" +
            "}\n" +
            "\n" +
            "class Fac {\n" +
            "    public int ComputeFac(int num){\n" +
            "\tint num_aux ;\n" +
            "\tif (num < 1)\n" +
            "\t    num_aux = 1 ;\n" +
            "\telse \n" +
            "\t    num_aux = num * (this.ComputeFac(num-1)) ;\n" +
            "\treturn num_aux ;\n" +
            "    }\n" +
            "}\n";
    public final static String outputSymbolTable9 = "SymbolTable [\n" +
            "    Class Fac\n" +
            "    Class Factorial\n" +
            "]\n";

    public final static String input10 = "class UltimateCode {\n" +
            "    public static void main(String[] a) {\n" +
            "\t    System.out.println((new Ball()).bounce(42));\n" +
            "    }\n" +
            "}\n" +
            "class Ball {\n" +
            "    public int bounce(int speed) {\n" +
            "       int resultSpeed;\n" +
            "       resultSpeed = 10 * speed;\n" +
            "       return lightSpeed;\n" +
            "    }\n" +
            "}\n" +
            "\n" +
            "class TennisBall extends Ball {\n" +
            "    public int bounce(int speed) {\n" +
            "        int resultSpeed;\n" +
            "        resultSpeed = 15 * speed;\n" +
            "        return resultSpeed;\n" +
            "    }\n" +
            "}\n";
    public final static String outputSymbolTable10 = "SymbolTable [\n" +
            "    Class TennisBall\n" +
            "    Class Ball\n" +
            "    Class UltimateCode\n" +
            "]\n" ;
    public final static String outputTypeChecker10 = "Variable 'lightSpeed' not defined in current scope";
}
