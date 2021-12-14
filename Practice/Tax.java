package JavaOOP.Practice;

public class Tax {
    public static final int SINGLE_FILER = 0;
    public static final int MARRIED_JOINTLY_OR_QUALIFYING_WIDOW = 1;
    public static final int MARRIED_SEPARATELY = 2;
    public static final int HEAD_OF_HOUSEHOLD = 3;
    int status = 4;
    int val = 1;
    private int filingStatus;
    private int[][] brackets = new int[status][val];
    private double[] rates = new double[status];
    private double taxableIncome;

    public Tax() {
        filingStatus = 0;
        for (int i = 0; i < status; i++) {
            for (int j = 0; j < val; j++) {
                brackets[i][j] = 0;
            }
        }
        for (int i = 0; i < status; i++) {
            rates[i] = 0.0;
        }
        taxableIncome = 0.0;
    }

    public Tax(int filingStatus, int[][] brackets, double[] rates, double taxableIncome) {
        this.filingStatus = filingStatus;
        this.brackets = brackets;
        this.rates = rates;
        this.taxableIncome = taxableIncome;
    }

    public void setStatus(int s) {
        if (s == 0) {
            
        }
    }
}

