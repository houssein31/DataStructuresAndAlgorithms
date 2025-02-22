package javaPrep.interviewQuestions;

//Number of likes and dislikes
//
//Your friend and you made a list of topics and both of them voted if they like or dislike the topic. They wrote O to
// denote dislike and 1 to denote like. They asked you to count the number of topics that both like or both dislike.
//
// Input format
//
// • The first line contains a string, A, denoting Bob's likes and dislikes
// • The second line contains a string, P, denoting Alice's likes and dislikes.
//
// Output format
//   Print the number of topics both, Bob and Alice, like or dislike.
//
//  • Both A and P contains only 0 and 1. O denotes dislike and 1 denotes like.
//
//Sample input
// 010101
// 101101
//
//Sample output
// 3
//
//Explanation
//  \(A = 010101)
//  \(P = 101101)
//  They both like \(4{th}\) and (6{th}\) topic and they both dislike \(5^{th}\) topic. So answer is 3.


public class NumberOfLikesAndDislikes {

    public static int count_like_dislike(String a, String b) {

        int matchCount = 0;

        for(int i = 0; i < a.length(); i++) {

            if(a.charAt(i) == b.charAt(i)) {
                matchCount++;
            }
        }

        return matchCount;
    }

    public static void main(String[] args) {

        String a1 = "010101";
        String b1 = "101101";

        System.out.println(count_like_dislike(a1, b1));
    }
}
