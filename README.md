# Streams  :

Stream has below features : 
1) No Storage : Streams don't have separate storage like collection, array
2) Functional in Nature : Produces a result but does not modify source
3) Laziness Seeking  : All Intermediate operations are always lazy
4) Consumable : Elements of stream are only visited once during life of stream life.

## How to generate Stream obtain
1) using stream() or parallelStream()
2) Arrays.stream(Object[])
3) Stream.of(Object[])
4) IntStream.range(int,int)
5) Random.ints()

## Streams Operation are divided in two main things
### Intermediate Operations:
1) Return new stream always
2) Traverse does not begin until terminal operation of pipeline executed 
3) These have two main times 
   1) Stateless : Each element processed separately 
   2) Stateful : Complete object processed to generate result. e.g. sort,distinct
4) These are always Lazy loaded
5) List of Intermediate operations : 
   1) filter
   2) map
   3) flatmap
   4) distinct
   5) sorted
   6) limit
   7) skip

### Terminal Operations : 
1) Returns primitive value, Concrete type like Optional, void
2) These are eagerly executed & always last operation
3) List of Terminal operations :
   1) allMatch()
   2) anyMatch()
   3) noneMatch()
   4) collect()
   5) count()
   6) forEach()
   7) min()
   8) max()
   9) reduce()


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

Hello