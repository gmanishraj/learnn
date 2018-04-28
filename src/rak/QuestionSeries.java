package rak;

public class QuestionSeries {
	static String info ="Java Online Test Week  \n \nINSTRUCTIONS:\nThere are 25 questions in this test and 5 minutes to complete them all.\nThe finish button is highlighted in green when you reach the end of the test. \nClicking the finish button will display the results with the correct answers marked in light red.  \n \nThe timecounter  begins when you click on the 'start' button \n \nBest of luck!\n";

	static String []question ={"Question 1:\nJava was first developed in?",
	"Question 2:\nThe old name of java was",
	"Question 3: \nJava Source Code is compiled into_______?",
	"Question 4:\nWhich of the tool is used to compile java code?",
	"Question 5:\nWhich of the following is used to interpret and execute java applet classes hosted by HTML?",
	"Question 6:\nWhich of the following is smallest integer data type?",
	"Question 7:\nInteger data type does not include following premitive data type_______?",
	"Question 8:\nFollowing file is human readable in java programming language?",
	"Question 9:\nWhich of the following feature is not supported by java?",
	"Question 10:\nWhat is the full form of JDK?",
	"Question 11:\nWhat is the full form of JVM?",
	"Question 12:\nWhich inheritance is not supported in java?",
	"Question 13:\nWhich is a component in AWT that can contain another components like buttons,textfields,labels etc..?",
	"Question 14:\nWhich class provides many methods for graphics programming?",
	"Question 15:\nWhich are passive controls that do not support any interaction with the user?",
	"Question 16:\nBy Which method you can set or change the text in a label?",
	"Question 17:\nWhich package is used for GUI?",
	"Question 18:\nhow many reserved keywords currently defined in the Java language?",
	"Question 19:\nIn this type one super-class is having more than one sub-class?",
	"Question 20:\nWhich Who is called as father of Java programming language ?",
	"Question 21:\nWhich statement provides an easy way to dispatch execution to different parts of your code based on the value of an expression?",
	"Question 22:\nWhich one of the following is a valid statement?",
	"Question 23:\nWhich of these keywords is used by a class to use an interface defined previously?",

	"Question 24:\nWhich of these method of class String is used to extract a single character from a String object?",
	"Question 25:\nIn java arrays are"
	};


	static String [][]answers ={{"1990\n","1991\n","1993\n","1995\n"},{"J language\n","Oak\n","Oct\n","None of the above\n"},{" \nSource Code\n",".Obj\n",".Exe\n","Bytecode\n"},{" \njar","javac\n"," \njavadoc\n"," \njava\n"},{" \nappletshow\n"," \nappletwatcher\n"," \nappletviewer\n"," \nappletscreen\n"},{" \nlong\n"," \nint\n"," \nshort\n","byte\n"},{" \ndouble\n"," \nlong\n"," \nshort\n"," \nbyte\n"},{" \n.java\n"," \n.jar\n"," \n.obj\n"," \n.class\n"},{" \nmultithreading\n"," \nreflection\n"," \noperator overloading\n"," \ngarbage collection\n"},{" \nJava Data Kit\n"," \nJava Defination Kit\n"," \nJava Design Kit\n"," \nJava Development Kit\n"},{" \nJava Variable Machine\n"," \nJava Virtual Machine\n"," \nJava Virtual Machanism\n"," \nJava Variable Mechanism\n"},{" \nsingle inheritance\n"," \nhybrid inheritance\n"," \nmultilevel inheritance\n"," \nmultiple inheritance\n"},{" \nwindow\n"," \ncontainer\n"," \npanel\n"," \nframe\n"},{"java.awt\n"," \njava.Graphics\n"," \njava.awt.Graphics\n"," \nnone of the above\n"},{" \nChoice\n"," \nlist\n"," \nlabel\n"," \ncheckbox\n"},{" \nsetText()\n"," \ngetText()\n","\nboth \n"," \nnone of the above\n"},{" \njava.lang\n"," \njava.awt\n"," \njava.io\n"," \njava.lang.ref\n"},{" \n48\n"," \n50\n"," \n49\n","\n51\n"},{" \nHierarchical inheritance\n"," \nsingle inheritance\n"," \nmultiple inheritance\n"," \nmultilevel inheritance\n"},{" \nJames Gosling\n"," \nKen Thompson\n"," \nDennis Richie\n"," \nnone of the above\n"},{" \nif\n"," \nswitch\n"," \nnested-if\n"," \nif-else-if\n"},{"char[] c=new char();\n"," \nchar[] c=new char[5];\n"," \nchar[] c=new char(4);\n"," \nchar[] c=new char[];\n"},{" Implements\n"," import\n"," implements\n"," Import\n"},{" \nCHARAT()\n"," \nchatat()\n"," \nChatAt()\n"," \ncharAt()\n"},{"none of the above\n","primitive data type\n","object references\n"," \nobjects\n"} };

	static int []n = {1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1};
	static String []choice= {"2","2","4","2","3","4","1","1","3","4","2","4","2","3","3","1","2","3","1","1","2","2","3","4","1"};
	static int tally = choice.length;
	static String testtitle="Java Programming Online Test";
	static int timeLimit =5;
	static int passMark = 33;
	}


