public class data {
    

    private double sum;
    private double max;
    private int count;

    public data(){

        sum = 0;
        max = Double.NEGATIVE_INFINITY;
        count = 0;


    }

    public void add(Double value){

        sum += value;

        if (value > max){

            max = value;

        }

        count ++;


    }

    public double getMax(){

        if ( count == 0) return 0;
        return max;
        

    }

    public double getAverage(){

        if (count == 0) return 0;
        return (sum/count);

    }

}
