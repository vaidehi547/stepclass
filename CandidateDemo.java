import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Candidate {
    int candidateId;
    String name;
    int aptitude;
    int technical;
    int communication;

    Candidate(int candidateId, String name, int aptitude,
              int technical, int communication) {

        this.candidateId = candidateId;
        this.name = name;
        this.aptitude = aptitude;
        this.technical = technical;
        this.communication = communication;
    }

    int getTotalScore() {
        return aptitude + technical + communication;
    }
}

public class CandidateDemo {

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(
                new InputStreamReader(System.in));

        // Read N and K
        StringTokenizer firstLine =
                new StringTokenizer(br.readLine());

        int n = Integer.parseInt(firstLine.nextToken());
        int k = Integer.parseInt(firstLine.nextToken());

        Candidate[] candidates = new Candidate[n];

        // Read candidate details
        for (int i = 0; i < n; i++) {

            String line = br.readLine();

            // Allows both comma and space separated input
            line = line.replace(",", " ");

            StringTokenizer st = new StringTokenizer(line);

            int id = Integer.parseInt(st.nextToken());
            String name = st.nextToken();
            int aptitude = Integer.parseInt(st.nextToken());
            int technical = Integer.parseInt(st.nextToken());
            int communication = Integer.parseInt(st.nextToken());

            candidates[i] = new Candidate(
                    id,
                    name,
                    aptitude,
                    technical,
                    communication
            );
        }

        // Sort candidates
        for (int i = 0; i < n - 1; i++) {

            for (int j = 0; j < n - i - 1; j++) {

                int score1 = candidates[j].getTotalScore();
                int score2 = candidates[j + 1].getTotalScore();

                // Higher score first
                // If same score, smaller ID first
                if (score1 < score2 ||
                    (score1 == score2 &&
                     candidates[j].candidateId >
                     candidates[j + 1].candidateId)) {

                    Candidate temp = candidates[j];

                    candidates[j] = candidates[j + 1];

                    candidates[j + 1] = temp;
                }
            }
        }

        // Display Top K candidates
        for (int i = 0; i < k; i++) {

            System.out.println(
                    candidates[i].candidateId + " " +
                    candidates[i].name + " " +
                    candidates[i].getTotalScore()
            );
        }
    }
}