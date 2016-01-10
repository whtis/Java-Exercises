import javax.swing.*;

/**
 * Created by ht on 2015/12/12.
 */
public class $6_8 {
    public static void main(String[] args) {
        Vote vote1 = new Vote();
        Vote vote2 = new Vote();

        Candidate candidate1 = new Candidate("haha", vote1);
        Candidate candidate2 = new Candidate("heihei", vote2);

        int v = Integer.parseInt(JOptionPane.showInputDialog("please enter a number: "));
        while (v != 0) {
            switch (v) {
                case 1:
                    candidate1.vote.increment();
                    break;
                case -1:
                    candidate1.vote.decrement();
                    break;
                case 2:
                    candidate2.vote.increment();
                    break;
                case -2:
                    candidate2.vote.decrement();
                    break;
                default:
                    System.out.println(v + "is an invalid vote");
            }
            v = Integer.parseInt(JOptionPane.showInputDialog("please enter a number: "));
        }

        //output the result
        System.out.println(candidate1.getNumberOfCandidates());
        System.out.println(candidate1.name + " 's votes are " + candidate1.vote.getCount());
        System.out.println(candidate2.name + " 's votes are " + candidate2.vote.getCount());
        candidate1.vote.clear();
        candidate2.vote.clear();
        System.out.println(candidate1.name + " 's votes are " + candidate1.vote.getCount());
        System.out.println(candidate2.name + " 's votes are " + candidate2.vote.getCount());

    }

}

class Vote {
    int count;

    public void clear() {
        count = 0;
    }

    public void increment() {
        count++;
    }

    public void decrement() {
        count--;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}

class Candidate {
    String name;
    Vote vote;
    static int numberOfCandidates;

    public Candidate() {
        numberOfCandidates++;
    }

    public Candidate(String name, Vote vote) {
        this.name = name;
        this.vote = vote;
        numberOfCandidates++;
    }

    public String getName() {
        return name;
    }

    public Vote getVote() {
        return vote;
    }

    public int getNumberOfCandidates() {
        return numberOfCandidates;
    }
}