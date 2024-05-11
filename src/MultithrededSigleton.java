public class MultithrededSigleton {

    private static MultithrededSigleton multithrededSigleton;

    private MultithrededSigleton(){}

    public static MultithrededSigleton getInstance(){

        if(multithrededSigleton==null){

            synchronized (MultithrededSigleton.class){

                if(multithrededSigleton==null){

                    return multithrededSigleton= new MultithrededSigleton();
                }
            }



        }
            return  multithrededSigleton;


    }

}
