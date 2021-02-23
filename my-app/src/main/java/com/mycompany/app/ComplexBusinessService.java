@Component
public class ComplexBusinessService {
    @Autowired
    // Loosely coupled - Removes the instantiation of Dependencies
    SortAlgorithm sortAlgorithm; // = new BubbleSortAlgorithm();

    // Provides constructor to do the instantation - with the dependency as argument
    public ComplexBusinessService (SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public static void main(String[] args) {
        // possible to replace the "new BubbleSortAlgorithm" with a different algorithm
        SortAlgorithm sortAlgorithm = new BubbleSortAlgorithm;
        ComplexBusinessService businessService = new ComplexBusinessService(sortAlgorithm);
    }

}

// Instead of this - which is tightly coupled
/*

public class ComplexBusinessService {

    SortAlgorithm sortAlgorithm = new BubbleSortAlgorithm();

}

public class BubbleSortAlgorithm implements SortAlgorithm {

}



*/