package InterviewQuestions;

//  Computer Crash
//
//      Your computer has two RAM sticks containing memory1 and memory2 bits of memory respectively. A virus has entered your computer. Each second since its entry, it is consuming increasing bits of memory. On second 1, it consumes 1 bit of memory, on second 2 it consumes 2 bits of memory, on second 3 it consumes 3 bits of memory, and so on. It consumes memory from the RAM which contains a higher memory or from the first RAM if both have the same memory left. If neither RAM has the memory needed to feed the virus, the computer crashes.
//
//      Find out the first second when the computer crashes and the memory contents of the RAMs at that second.
//
//        Note: If the virus cannot get full memory, it does not feed the partial memory.
//
//        Function description
//
//      Complete the function solution() provided in the editor. The function takes the following 2 parameters and returns the solution.
//	        • memory1: Returns the memory of RAM 1
//          • memory2. Returns the memory of RAM 2
//
//      Input format for custom testing
//
//      Note: Use this input format if you are testing against custom input or writing code in a language where we don't provide boilerplate code
//
//        • The first line contains memory denoting the memory of RAM 1.
//        • The second line contains memory2 denoting the memory of RAM 2
//
//      Output format
//
//      Print 3 integers, representing the second when the computer crashes and the memory remaining in RAM 1 and RAM 2 respectively.
//
//      Constraints
//          1 ≤ memory1, memory2 < 109
//
//      Source: HackerEarth2

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ComputerCrash {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        PrintWriter wr = new PrintWriter (System.out);

        // Reading memory1 and memory2 from the user
        int memory1 = Integer.parseInt(br.readLine().trim());
        int memory2 = Integer.parseInt(br.readLine().trim());

        int[] result = solution(memory1, memory2);

        // Print the result array
        for (int i : result) {
            System.out.println(i);
        }

        wr.close();
        br.close();
    }

    public static int[] solution(int memory1, int memory2) {

        return new int[0];
    }
}
