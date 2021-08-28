# IF688 - Teoria e Implementação de Linguagens Computacionais

## Atividade 4 - _Type-Checking_ MiniJava

O objetivo deste exercício é criar um _type checker_ para programas MiniJava.

- Este projeto inclui classes `Java` representando os nós da AST de MiniJava, bem como interfaces para os _visitors_. No projeto, já há classes utilizadas para representação da tabela de símbolos (completamente implementadas já);
  - A classe `SymbolTable` tem a informação de tipo de todas as classes declaradas no programa. 
  - Cada nome de classe é mapeado num objeto `Class`, que tem toda a informação de tipo dos atributos e declarações de método. O mapa de nomes de classe para objetos `Class` está contido na classe `SymbolTable`; 
  - Cada método é mapeado num objeto `Method`, que tem toda a informação de tipo dos parâmetros, tipo de retorno e variáveis locais. O mapa de nomes de métodos para objetos `Method` está contido na _hashtable_ `methods` que está contida na entrada da classe onde o método foi declarado;
  - Similarmente, cada variável é mapeada a uma instância da classe `Variable`, armazenando a informação de tipo da variável. Este mapeamento é armazenado nas _hashtables_ locais de um objeto `Method`, ou dentro da _hashtable_ `globals` de um objeto `Class`, dependendo de onde a variável foi declarada (como variável local de um método ou como atributo de classe).
- As classes `BuildSymbolTableVisitor` e `TypeCheckVisitor` estão ***incompletas*** e tem apenas o esqueleto do código que visita a AST de um programa MiniJava. ***Para este exercício, você preencherá o código destes arquivos.***
- A checagem de tipos de um programa se dá em duas fases. Na primeira, você precisa construir a tabela de símbolos (`SymbolTable`) com a informação de tipo declarada. A implementação desta fase estará contida na classe `BuildSymbolTableVisitor`.
  - Estude as classes `SymbolTable` e `BuildSymbolTableVisitor`, disponíveis no projeto;
  - Em `BuildSymbolTableVisitor` você deve adicionar código que processa nós da AST que declaram classes, métodos, variáveis, etc.
  - Ao visitar nós derivados de `ClassDecl`, você deve primeiro criar uma entrada na tabela de símbolos para o nó `ClassDecl` sendo visitado, usando o método `addClass(...)` da classe `SymbolTable`. Então, a variável `currClass` de `BuildSymbolTableVisitor` deve ser assinalada para a nova entrada (o objeto `Class`) do nó `ClassDecl` sendo visitado. Desta forma, fazer referência à variável `currClass` dentro dos métodos `visit` para os nós de `VarDecl` e `MethodDecl` permitirá a adição de variáveis e métodos de uma declaração de classe (`ClassDecl`) no objeto correto da tabela de símbolos;
  - De maneira similar, ao visitar nós `MethodDecl`, a variável `currMethod` de `BuildSymbolTableVisitor` deve ser assinalada para o objeto `Method` correspondente ao nó `MethodDecl` atual. Assim, dentro de outros métodos `visit` é possível adicionar variáveis locais e parâmetros formais de um `MethodDecl` no objeto `Method` correto.
- Uma vez que todas as declarações foram processadas e armazenadas no objeto `SymbolTable`, podemos fazer a checagem de tipo de instruções e expressões. A implementação desta fase estará contida na classe `TypeCheckVisitor`
  - Toda instrução e expressão tem suas próprias regras de tipo. A seguir há uma lista *incompleta* de tais regras. Outras podem ser derivadas a partir da especificação da linguagem Java (qualquer programa MiniJava válido é um programa Java válido)
    - Operandos de operações aritméticas devem ter o mesmo tipo, que deve consistir do tipo `Integer`;
    - Operandos de operações lógicas devem ter o mesmo tipo, que deve consistir do tipo `Boolean`;
    - Expressões condicionais de `if` e `while` devem ser do tipo `Boolean`;
    - O lado direito de uma instrução de atribuição deve ser do mesmo tipo que o lado esquerdo; 
    - 
- Na classe `App`, você pode testar com os diferentes programas disponíveis em `Programs`, basta trocar o nome da variável `input` na linha 27.

Note que para todas as possíveis exceções das duas fases de implementação, será necessário usar as funções da classe `PrintException` que vem com o próprio esqueleto do projeto, pois é dessa forma que será avaliado o *output* da submissão (exemplos de entrada e saída seguem abaixo).

## Entrada

Programas escritos em MiniJava, usando a AST disponível no pacote `ast`.

## Saída

Imprimir a Symbol Table e a possível exceção no caso de erro de tipos.

## Exemplos

### Sample Input 1
```java
class UltimateCode {
    public static void main(String[] a) {
	    System.out.println((new Ball()).bounce(42));
    }
}

class Ball {
    public int bounce(int speed) {
       int[] array;
       int integer;
       boolean bool;

       integer = 10 * speed;
       array[0] = integer;
       bool = true;

       while (integer) {
        System.out.println(12);
       }

       return integer;
    }
}
```

### Sample Output 1
```
SymbolTable [
    Class Ball
    Class UltimateCode
]
Couldn't match expected type 'BooleanType' with actual type 'IntegerType'
```

### Sample Input 2
```java
class UltimateCode {
    public static void main(String[] a) {
	    System.out.println((new Ball()).bounce(42, 12));
    }
}
class Ball {
    public int bounce(int speed) {
       int resultSpeed;
       resultSpeed = 10 * speed;
       return resultSpeed;
    }
}

class TennisBall extends Bal {
    public int bounce(int speed) {
        int resultSpeed;
        resultSpeed = 15 * speed;
        return resultSpeed;
    }
}
```

### Sample Output 2
```
SymbolTable [
    Class TennisBall
    Class Ball
    Class UltimateCode
]
Method 'bounce' call has too many arguments
```

### Sample Input 3
```java
class UltimateCode {
    public static void main(String[] a) {
	    System.out.println((new Ball()).bounce());
    }
}
class Ball {
    public int bounce(int speed) {
       int resultSpeed;
       resultSpeed = 10 * speed;
       return resultSpeed;
    }
}

class TennisBall extends Bal {
    public int bounce(int speed) {
        int resultSpeed;
        resultSpeed = 15 * speed;
        return resultSpeed;
    }
}
```

### Sample Output 3
```
SymbolTable [
    Class TennisBall
    Class Ball
    Class UltimateCode
]
Method 'bounce' call has too few arguments
```

### Sample Input 4
```java
class LinkedList{
    public static void main(String[] a){
	System.out.println(new LL().Start());
    }
}

class Element {
    int Age ;
    int Salary ;
    boolean Married ;

    // Initialize some class variables
    public boolean Init(int v_Age, int v_Salary, boolean v_Married){
	Age = v_Age ;
	Salary = v_Salary ;
	Married = v_Married ;
	return true ;
    }

    public int GetAge(){
	return Age ;
    }

    public int GetSalary(){
	return Salary ;
    }

    public boolean GetMarried(){
	return Married ;
    }

    // This method returns true if the object "other"
    // has the same values for age, salary and
    public boolean Equal(Element other){
	boolean ret_val ;
	int aux01 ;
	int aux02 ;
	int nt ;
	ret_val = true ;

	aux01 = other.GetAge();
	if (!this.Compare(aux01,Age)) ret_val = false ;
	else {
	    aux02 = other.GetSalary();
	    if (!this.Compare(aux02,Salary)) ret_val = false ;
	    else
		if (Married)
		    if (!other.GetMarried()) ret_val = false;
		    else nt = 0 ;
		else
		    if (other.GetMarried()) ret_val = false;
		    else nt = 0 ;
	}

	return ret_val ;
    }

    // This method compares two integers and
    // returns true if they are equal and false
    // otherwise
    public boolean Compare(int num1 , int num2){
	boolean retval ;
	int aux02 ;
	retval = false ;
	aux02 = num2 + 1 ;
	if (num1 < num2) retval = false ;
	else if (!(num1 < aux02)) retval = false ;
	else retval = true ;
	return retval ;
    }

}

class List{
    Element elem ;
    List next ;
    boolean end ;

    // Initialize the node list as the last node
    public boolean Init(){
	end = true ;
	return true ;
    }

    // Initialize the values of a new node
    public boolean InitNew(Element v_elem, List v_next, boolean v_end){
	end = v_end ;
	elem = v_elem ;
	next = v_next ;
	return true ;
    }

    // Insert a new node at the beginning of the list
    public List Insert(Element new_elem){
	boolean ret_val ;
	List aux03 ;
	List aux02 ;
	aux03 = this ;
	aux02 = new List();
	ret_val = aux02.InitNew(new_elem,aux03,false);
	return aux02 ;
    }


    // Update the the pointer to the next node
    public boolean SetNext(List v_next){
	next = v_next ;
	return true ;
    }

    // Delete an element e from the list
    public List Delete(Element e){
	List my_head ;
	boolean ret_val ;
	boolean aux05;
	List aux01 ;
	List prev ;
	boolean var_end ;
	Element var_elem ;
	int aux04 ;
	int nt ;


	my_head = this ;
	ret_val = false ;
	aux04 = 0 - 1 ;
	aux01 = this ;
	prev = this ;
	var_end = end;
	var_elem = elem ;
	while ((!var_end) && (!ret_val)){
	    if (e.Equal(var_elem)){
		ret_val = true ;
		if (aux04 < 0) {
		    // delete first element
		    my_head = aux01.GetNext() ;
		}
		else{ // delete a non first element
		    System.out.println(0-555);
		    aux05 = prev.SetNext(aux01.GetNext());
		    System.out.println(0-555);

		}
	    } else nt = 0 ;
	    if (!ret_val){
		prev = aux01 ;
		aux01 = aux01.GetNext() ;
		var_end = aux01.GetEnd();
		var_elem = aux01.GetElem();
		aux04 = 1 ;
	    } else nt = 0 ;
	}
	return my_head ;
    }


    // Search for an element e on the list
    public int Search(Element e){
	int int_ret_val ;
	List aux01 ;
	Element var_elem ;
	boolean var_end ;
	int nt ;

	int_ret_val = 0 ;
	aux01 = this ;
	var_end = end;
	var_elem = elem ;
	while (!var_end){
	    if (e.Equal(var_elem)){
		int_ret_val = 1 ;
	    }
	    else nt = 0 ;
	    aux01 = aux01.GetNext() ;
	    var_end = aux01.GetEnd();
	    var_elem = aux01.GetElem();
	}
	return int_ret_val ;
    }

    public boolean GetEnd(){
	return end ;
    }

    public Element GetElem(){
	return elem ;
    }

    public List GetNext(){
	return next ;
    }


    // Print the linked list
    public boolean Print(){
	List aux01 ;
	boolean var_end ;
	Element  var_elem ;

	aux01 = this ;
	var_end = end ;
	var_elem = elem ;
	while (!var_end){
	    System.out.println(var_elem.GetAge());
	    aux01 = aux01.GetNext() ;
	    var_end = aux01.GetEnd();
	    var_elem = aux01.GetElem();
	}

	return true ;
    }
}


// this class invokes the methods to insert, delete,
// search and print the linked list
class LL{

    public int Start(){

	List head ;
	List last_elem ;
	boolean aux01 ;
	Element el01 ;
	Element el02 ;
	Element el03 ;

	last_elem = new List();
	aux01 = last_elem.Init();
	head = last_elem ;
	aux01 = head.Init();
	aux01 = head.Print();

	// inserting first element
	el01 = new Element();
	aux01 = el01.Init(25,37000,false);
	head = head.Insert(el01);
	aux01 = head.Print();
	System.out.println(10000000);
	// inserting second  element
	el01 = new Element();
	aux01 = el01.Init(39,42000,true);
	el02 = el01 ;
	head = head.Insert(el01);
	aux01 = head.Print();
	System.out.println(10000000);
	// inserting third element
	el01 = new Element();
	aux01 = el01.Init(22,34000,false);
	head = head.Insert(el01);
	aux01 = head.Print();
	el03 = new Element();
	aux01 = el03.Init(27,34000,false);
	System.out.println(head.Search(el02));
	System.out.println(head.Search(el03));
	System.out.println(10000000);
	// inserting fourth element
	el01 = new Element();
	aux01 = el01.Init(28,35000,false);
	head = head.Insert(el01);
	aux01 = head.Print();
	System.out.println(2220000);

	head = head.Delete(el02);
	aux01 = head.Print();
	System.out.println(33300000);


	head = head.Delete(el01);
	aux01 = head.Print();
	System.out.println(44440000);

	return 0 ;
    }

}
```

### Sample Output 4
```
SymbolTable [
    Class Element
    Class List
    Class LinkedList
    Class LL
]
```

### Sample Input 5
```java
class UltimateCode {
    public static void main(String[] a) {
	    System.out.println((new Ball()).teleport(42));
    }
}
class Ball {
    public int bounce(int speed) {
       int resultSpeed;
       resultSpeed = 10 * speed;
       return resultSpeed;
    }
}

class TennisBall extends Ball {
    public int bounce(int speed) {
        int resultSpeed;
        resultSpeed = 15 * speed;
        return resultSpeed;
    }
}
```

### Sample Output 5
```
SymbolTable [
    Class TennisBall
    Class Ball
    Class UltimateCode
]
Identifier 'teleport' could not be found
```

### Sample Input 6
```java
class UltimateCode {
    public static void main(String[] a) {
	    System.out.println(12);
    }
}

// ################ new Class
class Ball {
    public int bounce(int speed) {
       int resultSpeed;
       resultSpeed = 10 * speed;
       return resultSpeed;
    }
}

class TennisBall extends Bal {
    public int bounce(int speed) {
        int resultSpeed;
        resultSpeed = 15 * speed;
        return resultSpeed;
    }
}
```

### Sample Output 6
```
SymbolTable [
    Class TennisBall
    Class Ball
    Class UltimateCode
]
Identifier 'Bal' could not be found
```

### Sample Input 7
```java
class UltimateCode {
    public static void main(String[] a) {
	    System.out.println((new Ball()).bounce(42));
    }
}

class Ball {
    public int bounce(int speed) {
       int[] array;
       int integer;
       boolean bool;
       array[0] = integer;
       integer = 21;
       bool = true;

       if (10 * 2 < array.length - array[0]) {
        integer = 42;
       }
       else {
        integer = 9000;
       }

       return integer;
    }
    public int double(int shape, int shape) {
        return 2 * shape;
    }
}
```

### Sample Output 7
```
The parameter 'shape' was already declared!
```

### Sample Input 8
```java
class UltimateCode {
    public static void main(String[] a) {
	    System.out.println((new Ball()).bounce(42));
    }
}

class Ball {
    public int bounce(int speed) {
       int[] array;
       int integer;
       boolean bool;
       array[0] = integer;
       integer = 21;
       bool = true;

       if (10 * 2 < array.length - array[0]) {
        integer = 42;
       }
       else {
        integer = 9000;
       }

       return integer;
    }
}
class Ball {
    public int bounce(int speed) {
        return speed;
    }
}
```

### Sample Output 8
```
The class 'Ball' was already declared!
```

### Sample Input 9
```java
class Factorial{
    public static void main(String[] a){
	System.out.println(new Fac().ComputeFac(10));
    }
}

class Fac {
    public int ComputeFac(int num){
	int num_aux ;
	if (num < 1)
	    num_aux = 1 ;
	else 
	    num_aux = num * (this.ComputeFac(num-1)) ;
	return num_aux ;
    }
}
```

### Sample Output 9
```
SymbolTable [
    Class Fac
    Class Factorial
]
```

### Sample Input 10
```java
class UltimateCode {
    public static void main(String[] a) {
	    System.out.println((new Ball()).bounce(42));
    }
}
class Ball {
    public int bounce(int speed) {
       int resultSpeed;
       resultSpeed = 10 * speed;
       return lightSpeed;
    }
}

class TennisBall extends Ball {
    public int bounce(int speed) {
        int resultSpeed;
        resultSpeed = 15 * speed;
        return resultSpeed;
    }
}
```

### Sample Output 10
```
SymbolTable [
    Class TennisBall
    Class Ball
    Class UltimateCode
]
Variable lightSpeed not defined in current scope
```