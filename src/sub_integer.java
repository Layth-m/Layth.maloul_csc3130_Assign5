import java.util.Set;
public class sub_integer {
  public boolean is_subset(Set<Integer>one,Set<Integer>two){

      for(int i : one){
          //check all elements in set one, make sure they are contained in set two
          // if not return false
          if(!two.contains(i) ){
              return false;
          }
      }

      return true;

  }

}
