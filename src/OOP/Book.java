package OOP;

public class Book {

    //Fields
    public String title;
    public String author;
    private int nrOfPages;

    public void setNrOfPages (int nrOfPages) {
        if (isNrOfPagesValid(nrOfPages)) {
            this.nrOfPages = nrOfPages;
        } else {
            System.out.println("The provided number of pages is incorrect " + nrOfPages);
        }
    }
    private boolean isNrOfPagesValid (int nrOfPages){
        return nrOfPages >= 10;
    }

    public void printBookInfo(){
        if (isNrOfPagesValid(nrOfPages)){
            System.out.printf("The book %s with author %s has %d pages\n", title, author, nrOfPages);
        } else {
            System.out.println("Cannot print book info because number of pages is not correct");
        }


    }

}
