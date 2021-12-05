## Streams  :

When to use Collection?
If you want to represent group of objects as single entity then we should go for collection.

When to use Streams ? 
If you want to process objects from  collection then  we should use Streams.


### filter(Predicate)
To perform conditional check things always use filter

    numbersList.stream().filter(iNum -> iNum % 2 == 0).collect(Collectors.toList())

### map(Function)
To perform any logical operation and process collection  use map

    numbersList.stream().map(iNum -> iNum * 2).collect(Collectors.toList());


### collect()
To collect the result

    numbersList.stream().map(iNum -> iNum * 2).collect(Collectors.toList());

### count()
To count the number of objects are there in the matching criteria
    
    list.stream().filter(m->m>40).count()

### sorted()
To sort the result.
By Default this method support natural sorting.
 
    list.stream().sorted().collect(Collectors.toList()) -- Natural Sorting
    How to reverse the sorted collection order. 
    1) Use comparator :  list.stream().sorted((i1,i2)->(i1<i2)?1:(i1>i2)?-1:0).collect(Collectors.toList())
    2) Use -ve operator : list.stream().sorted((i1,i2)-> -i1.compareTo(i2)).collect(Collectors.toList()) 
    3) Reversing order of element : list.stream().sorted((i1,i2)-> i2.compareTo(i1)).collect(Collectors.toList())

### min()  
Note : Here min and max value change according to way how you implement comparator Ascending or Descending
In Short here min means always first element in sorted result and max is last element in sorted result

### max()
Note : Here min and max value change according to way how you implement comparator Ascending or Descending
In Short here max is last element in sorted result

### Printing of element Using streams
    Using foreach to execute function
        1) Inbuild Function
        2) Custom Function
    e.g
        1) names.stream().forEach(System.out::println);

        2) numbers.stream().forEach(
                i->System.out.println("New Way :: The square of "+i+" is "+(i*i)+".")
            );

### toArray 
To convert Collection into array
    
    numbers.stream().toArray(Integer[] ::new);

### Streams.of()
    1)Streams.of(array)
    2)Streams.of(1,2,3,4,5,6,7,8,9,0,11,22,33,455,7)
-----------------------------------------------------------------------------------------------