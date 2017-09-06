JAVA Programing
----------------------------------------------------
#### 1일차
____________________________________________________
  - JAVA의 특징

      - OOP

        > Object-Oriented Programing 의 약자로, 객체지향프로그래밍을 지원하는 언어이다.

      - 캡슐화

        > 모든 객체의 변수 및 메소드들은 접근제한자를 사용하여 사용범위를 제한함으로써 외부로부터 보호한다.

      - 상속

        > 상위 객체를 재사용함으로서 하위 객체를 빠르고 쉽게 설계할 수 있고, 반복된 코드의 중복을 줄인다.

      - __다형성__

        > 하나의 타입에 여러 객체를 대입함으로써 다양한 기능을 이용할 수 있다.

      - Garbage Collection(GC)

        > JAVA는 메모리를 GC에서 자동으로 관리해준다.

      - OS 독립성

        > 각 OS의 JVM을 통해 .class 인 바이트코드를 실행할 수 있다. 즉, 동일한 .class 파일을 다양한 OS에서 동작할 수
        있다.

  - JAVA의 Complie 순서

  - [함수의 작성 형태](https://github.com/Hooooong/DAY1_HelloJava/blob/master/src/HelloMain.java)

      - 접근제한자　　　　[static]　　　　리턴타입　　　　　함수명(매개변수...) { //Code }<br>
        public - 모든 접근을 허용<br>
        protected - 같은 패키지(폴더)에 있는 객체와 상속관계의 객체들만 허용<br>
        (default) - 같은 패키지(폴더)에 있는 객체들만 허용<br>
        private - 현재 객체 내에서만 허용<br>

        ```java
        // 주로 쓰이는 main 메소드
        public static void main(String[] args) {
        // code
        }
        ```

  - [변수의 연산](https://github.com/Hooooong/DAY1_HelloJava/blob/master/src/Sub.java)
      - 변수의 종류는 기본형(Primitive Type), 참조형(Reference Type) 이 있다.
      - 기본형(Primitive Type) : byte, char, short, int, long, float, double, boolean 이 있다.
      - 참조형(Reference Type) : 대표적으로 String 이 있다.

      - 정수 연산은 모두 int 로 대체되고, 실수 연산은 모두 double 로 대체된다
        ```java
        byte a = 7;
        byte b = 5;
        byte c = a + b;
        // Type mismatch: cannot convert from int to byte 가 발생한다.
        ```

      - long 은 뒤에 L, float 는 뒤에 F 를 붙여준다.
        ```java
        long l = 5L;
        float f = 1234.5F;
        ```

      - 형변환 ( int -> String, String -> int)
        ```java
        // 특이하게도 char와 int만 Character(Wrapper class), Integer(Wrapper class)의 이름을 쓰고
        // 다른 Type 의 Wrapper Class 는 맨 앞 글자를 대문자로 변경하면 된다.
        // ex) float -> Float, double -> Double

        // 숫자를 문자로 형변환하는 메소드
        public String changeNumberToString(int number) {
        	 // return number+"";
        	 return Integer.toString(number);
        }
        // 문자를 숫자로 형변환하는 메소드
        public int changeStringToNumber(String word) {
        	 return Integer.parseInt(word);
        }
        ```
