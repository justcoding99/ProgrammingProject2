import java.util.Scanner;

public class NameProject {

        public static void printA(int x) {
            for (int i = 0; i <= x; i++) {
                for (int j = 0; j <= 2 * x; j++) {
                    if ((j <= x && j + i == x) || (j >= x && j - i == x)) {
                        System.out.print("*");
                    } else if (j <= x + 2 && j >= x - 2 && i == (x / 2) + 1) {
                        System.out.print("*");
                    } else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }

        public static void printB(int x) {
            for (int i = 0; i <= 2 * x; i++) {
                for (int j = 0; j <= x; j++) {
                    if (j == 0 || (j <= x && (i == 0 || i == x || i == 2 * x)) || j == x) {
                        System.out.print("*");
                    } else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }

        public static void printC(int x) {
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < x; j++) {
                    if (i == 0 || j == 0 || i == x - 1) {
                        System.out.print("*");
                    } else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }

        public static void printD(int x) {
            for (int i = 0; i <= 2 * x; i++) {
                for (int j = 0; j <= x; j++) {
                    if ((i == 0 || i == 2 * x || j == 0 || j == x)) {
                        System.out.print("*");
                    } else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }

        public static void printE(int x) {
            for (int i = 0; i < 2 * x; i++) {
                for (int j = 0; j < x; j++) {
                    if (i == 0 || i == x || i == 2 * x - 1 || j == 0) {
                        System.out.print("*");
                    } else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }

        public static void printF(int x) {
            for (int i = 0; i <= 2 * x; i++) {
                for (int j = 0; j <= x; j++) {
                    if (i == 0 || i == x || j == 0) {
                        System.out.print("*");
                    } else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }

        public static void printG(int x) {
            for (int i = 0; i <= x; i++) {
                for (int j = 0; j <= x; j++) {
                    if (i == 0 || i == x || j == 0) {
                        System.out.print("*");
                    } else if (i == x / 2 && j >= x / 2)
                        System.out.print("*");
                    else if (i >= x / 2 && j == x) {
                        System.out.print("*");
                    } else
                        System.out.print(" ");

                }
                System.out.println();
            }

        }

        public static void printH(int x) {
            for (int i = 0; i <= 2 * x; i++) {
                for (int j = 0; j <= x; j++) {
                    if (i == x || j == 0 || j == x) {
                        System.out.print("*");
                    } else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }

        public static void printI(int x) {
            for (int i = 0; i <= x; i++) {
                for (int j = 0; j <= x; j++) {
                    if (j == 0)
                        System.out.print("*");
                }
                System.out.println();
            }
        }

        public static void printJ(int x) {
            for (int i = 0; i <= 2 * x; i++) {
                for (int j = 0; j <= x; j++) {
                    if (j == x && i <= 2 * x - 1)
                        System.out.print("*");
                    else if (i == 2 * x && j > 0 && j < x)
                        System.out.print("*");
                    else if (i > x && i < 2 * x && j == 0)
                        System.out.print("*");
                    else
                        System.out.print(" ");
                }
                System.out.println();
            }

        }

        public static void printK(int x) {
            for (int i = 0; i <= x + 1; i++) {
                for (int j = 0; j <= 2 * x; j++) {
                    if (j == 0 || (i < x && i + j == 4)) {
                        System.out.print("*");
                    } else if (i >= x - 2 && i - j == 2) {
                        System.out.print("*");
                    } else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }

        public static void printL(int x) {
            for (int i = 0; i <= x; i++) {
                for (int j = 0; j <= x; j++) {
                    if (i == x || j == 0) {
                        System.out.print("*");
                    } else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }

        public static void printM(int x) {
            for (int i = 0; i <= x; i++) {
                for (int j = 0; j <= 2 * x; j++) {
                    if (j == 0 || j == 2 * x || j == i) {
                        System.out.print("*");
                    } else if (i + j == 2 * x) {
                        System.out.print("*");
                    } else
                        System.out.print(" ");
                }
                System.out.println();
            }

        }

        public static void printN(int x) {
            for (int i = 0; i <= x; i++) {
                for (int j = 0; j <= x; j++) {
                    if (j == 0 || j == x || i == j) {
                        System.out.print("*");
                    } else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }

        public static void printO(int x) {
            for (int i = 0; i <= x; i++) {
                for (int j = 0; j <= x; j++) {
                    if (j == 0 || j == x || i == 0 || i == x) {
                        System.out.print("*");

                    } else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }

        public static void printP(int x) {
            for (int i = 0; i <= 2 * x; i++) {
                for (int j = 0; j <= x; j++) {
                    if (j == 0 || i == 0 || i == x) {
                        System.out.print("*");
                    } else if (j == x && i <= x) {
                        System.out.print("*");
                    } else
                        System.out.print(" ");
                }
                System.out.println();
            }

        }

        public static void printQ(int x) {
            for (int i = 0; i <= x + 1; i++) {
                for (int j = 0; j <= x + 1; j++) {
                    if ((j == x && i <= x) || ((i == x && j <= x))) {
                        System.out.print("*");
                    } else if (i == 0 && j <= x) {
                        System.out.print("*");
                    } else if (j == 0 && i <= x) {
                        System.out.print("*");
                    } else if (i >= (x / 2) + 2 && j == x - 2 && i < x + 1) {
                        System.out.print("*");
                    } else if (i > x && j == x + 1) {
                        System.out.print("*");

                    } else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }

        public static void printR(int x) {
            for (int i = 0; i <= 2 * x; i++) {
                for (int j = 0; j <= x; j++) {
                    if (j == 0 || i == 0 || i == x || (j == x && i <= x)) {
                        System.out.print("*");
                    } else if (i >= x && i - j == 4) {
                        System.out.print("*");
                    } else
                        System.out.print(" ");
                }
                System.out.println();
            }

        }

        public static void printS(int x) {
            for (int i = 0; i <= x * 2; i++) {
                for (int j = 0; j <= x; j++) {
                    if (i == 0 || i == x || i == 2 * x || ((j == 0 && i <= x) && (j == x))) {
                        System.out.print("*");
                    } else if (j == 0 && i <= x) {
                        System.out.print("*");
                    } else if (j == x && i >= x) {
                        System.out.print("*");
                    } else
                        System.out.print(" ");
                }
                System.out.println();
            }

        }

        public static void printT(int x) {
            for (int i = 0; i <= x; i++) {
                for (int j = 0; j <= x; j++) {
                    if (i == 0 || j == x / 2) {
                        System.out.print("*");
                    } else
                        System.out.print(" ");
                }
                System.out.println();

            }
        }

        public static void printU(int x) {
            for (int i = 0; i < 2 * x; i++) {
                for (int j = 0; j < x; j++) {
                    if (i == 2 * x - 1 || j == 0 || j == x - 1) {
                        System.out.print("*");
                    } else
                        System.out.print(" ");
                }
                System.out.println();
            }

        }

        public static void printV(int x) {
            for (int i = 0; i <= x; i++) {
                for (int j = 0; j <= 2 * x; j++) {
                    if (i == j || (j >= x && i + j == 2 * x)) {
                        System.out.print("*");
                    } else
                        System.out.print(" ");
                }
                System.out.println();
            }

        }

        public static void printW(int x) {
            for (int i = 0; i <= x; i++) {
                for (int j = 0; j <= 4 * x; j++) {
                    if (i == j || (j >= x && i + j == 2 * x)) {
                        System.out.print("*");
                    } else if (j > 2 * x && j - i == 2 * x) {
                        System.out.print("*");
                    } else if (j > 3 * x / 2 && i + j == 4 * x) {
                        System.out.print("*");
                    } else
                        System.out.print(" ");
                }
                System.out.println();
            }

        }

        public static void printX(int x) {
            for (int i = 0; i <= x; i++) {
                for (int j = 0; j <= x; j++) {
                    if (i == j || i + j == x) {
                        System.out.print("*");
                    } else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }

        public static void printY(int x) {
            for (int i = 0; i <= x; i++) {
                for (int j = 0; j <= x; j++) {
                    if ((i == j && i <= x / 2) || (j == x / 2 && i >= x / 2) || (j > x / 2 && i + j == x)) {
                        System.out.print("*");
                    } else
                        System.out.print(" ");
                }
                System.out.println();
            }

        }

        public static void printZ(int x) {
            for (int i = 0; i <= x; i++) {
                for (int j = 0; j <= x; j++) {
                    if (i == 0 || i == x || i + j == x) {
                        System.out.print("*");
                    } else
                        System.out.print(" ");
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            int x = 6;
            String name = "";
            Scanner scn = new Scanner(System.in);
            System.out.println("hello welcome to isik name it program");
            while (x>2)
            {
                System.out.print("\nThe following options are available for you:"
                        +"\n1) Display a name \n"
                        +"2) Change the size \n"
                        +"3) Exit \n"
                        +"Program Choose an option:");
                int option = scn.nextInt();

                if (option == 1) {
                    System.out.println("WHAT IS THE NAME? ");
                    name = scn.next();
                    for (int i = 0; i < name.length(); i++) {
                        char y = name.charAt(i);
                        if (y == 'a' || y == 'A')
                            printA(x);
                        if (y == 'b' || y == 'B')
                            printB(x);
                        if (y == 'c' || y == 'C')
                            printC(x);
                        if (y == 'd' || y == 'D')
                            printD(x);
                        if (y == 'e' || y == 'E')
                            printE(x);
                        if (y == 'f' || y == 'F')
                            printF(x);
                        if (y == 'G' || y == 'g')
                            printG(x);
                        if (y == 'h' || y == 'H')
                            printH(x);
                        if (y == 'i' || y == 'I')
                            printI(x);
                        if (y == 'J' || y == 'j')
                            printJ(x);
                        if (y == 'K' || y == 'k')
                            printK(x);
                        if (y == 'L' || y == 'l')
                            printL(x);
                        if (y == 'M' || y == 'm')
                            printM(x);
                        if (y == 'N' || y == 'n')
                            printN(x);
                        if (y == 'o' || y == 'O')
                            printO(x);
                        if (y == 'P' || y == 'p')
                            printP(x);
                        if (y == 'R' || y == 'r')
                            printR(x);
                        if (y == 'q' || y == 'Q')
                            printQ(x);
                        if (y == 'S' || y == 's')
                            printS(x);
                        if (y == 't' || y == 'T')
                            printT(x);
                        if (y == 'U' || y == 'u')
                            printU(x);
                        if (y == 'v' || y == 'V')
                            printV(x);
                        if (y == 'W' || y == 'w')
                            printW(x);
                        if (y == 'x' || y == 'X')
                            printX(x);
                        if (y == 'Y' || y == 'y')
                            printY(x);
                        if (y == 'z' || y == 'Z')
                            printZ(x);
                        System.out.println();

                    }
                } else if (option == 2) {
                    System.out.println("what is the size ?");
                    x = scn.nextInt();
                    for (int i = 0; i < name.length(); i++) {
                        char y = name.charAt(i);
                        System.out.println();
                    }


                } else if (option == 3)
                    break;
                else
                    System.out.println("wrong");

            }
        }
    }





