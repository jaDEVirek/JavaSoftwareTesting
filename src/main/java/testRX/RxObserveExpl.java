package testRX;


import rx.Observable;

public class RxObserveExpl {
    static String result = "";
    static DataTime data;

    public static void main(String[] args) {

        Observable<String> just = Observable.just("Lorem ipsum dolor");
//       Observable.create();

        System.out.println(just.share().subscribe());
        String[] letters = {"a2", "b", "c"};
        Observable.from(letters)
                .scan(new StringBuilder(), StringBuilder::append)
                .subscribe((total) ->{
                    System.out.println("Total -> " + total);
                    System.out.println("Result -> " + result);
                    result += total.toString();
                });
        System.out.println(result);
        String newStr = RxObserveExpl.DataTime.inner;
    }


    public static class DataTime {
        public static String inner;
    }
}
