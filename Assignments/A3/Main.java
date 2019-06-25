class Main{
    static int numberOfTries = 0;
    public static void main(String[] args){
        System.out.println("A3");
        int inputNumber = Integer.MIN_VALUE;
        while(inputNum >= 0) {            
            inputNumber = System.in.read();
            if(inputNumber == 0){
                numberOfTries++;
            }
            else if(inputNumber < 100) {
                update();
            }
            else{
                updateLarge();
            }
        }
    }
    private static void update(){
        //OracleManager oracleManager = new SqlServerManager();
        //oracleManager.update(inputNumber);

        SQLServerManager sqlServerManager = new SqlServerManager();
        sqlServerManager.update(inputNumber);
    }
    private static void updateLarge(){
        //OracleManager oracleManager = new SqlServerManager();
        //oracleManager.updateLarge(inputNumber);

        SQLServerManager sqlServerManager = new SqlServerManager();
        sqlServerManager.updateLarge(inputNumber);
    }
}