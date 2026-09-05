import java.util.Scanner;

public class ThreatLens {

    static int analyzeURL(String url) {

        int score = 0;

        System.out.println("\n[+] Running threat analysis...\n");

        // 1. URL length
        if (url.length() > 75) {
            score += 20;
            System.out.println("[!] Long URL: +20");
        } else {
            System.out.println("[+] URL length: Normal");
        }

        // 2. HTTPS check
        if (!url.startsWith("https://")) {
            score += 15;
            System.out.println("[!] No HTTPS: +15");
        } else {
            System.out.println("[+] HTTPS detected");
        }

        // 3. Suspicious symbols
        if (url.contains("@")) {
            score += 25;
            System.out.println("[!] Suspicious '@' symbol: +25");
        }

        // 4. Suspicious keywords
        String lowerURL = url.toLowerCase();

        String[] keywords = {
            "login", "verify", "secure",
            "update", "account", "password",
            "bank", "confirm"
        };

        boolean keywordFound = false;

        for (String keyword : keywords) {
            if (lowerURL.contains(keyword)) {
                keywordFound = true;
                break;
            }
        }

        if (keywordFound) {
            score += 20;
            System.out.println("[!] Suspicious keyword detected: +20");
        } else {
            System.out.println("[+] No suspicious keywords detected");
        }

        // 5. Numeric pattern
        if (url.matches(".*\\d+.*")) {
            score += 10;
            System.out.println("[!] Numeric pattern detected: +10");
        }

        // 6. IP address pattern
        if (url.matches(".*\\b\\d{1,3}(\\.\\d{1,3}){3}\\b.*")) {
            score += 20;
            System.out.println("[!] Possible IP address used: +20");
        }

        return Math.min(score, 100);
    }

    static String getVerdict(int score) {

        if (score >= 60) {
            return "HIGH RISK";
        } else if (score >= 30) {
            return "SUSPICIOUS";
        } else {
            return "LOW RISK";
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("========================================");
        System.out.println("              THREATLENS");
        System.out.println("       Cybersecurity Threat Analyzer");
        System.out.println("========================================");

        System.out.print("Enter a URL to analyze: ");
        String url = sc.nextLine().trim();

        if (url.isEmpty()) {
            System.out.println("[-] URL cannot be empty.");
            sc.close();
            return;
        }

        int score = analyzeURL(url);
        String verdict = getVerdict(score);

        System.out.println("\n========================================");
        System.out.println("             ANALYSIS RESULT");
        System.out.println("========================================");
        System.out.println("URL          : " + url);
        System.out.println("Threat Score : " + score + "/100");
        System.out.println("Verdict      : " + verdict);
        System.out.println("========================================");

        sc.close();
    }
}