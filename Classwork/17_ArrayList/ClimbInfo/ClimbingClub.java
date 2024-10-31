import java.util.ArrayList;

public class ClimbingClub
{
    /** The list of climbs completed by members of the club.
    * Guaranteed not to be null. Contains only non-null references.
    */
    
    private ArrayList<ClimbInfo> climbList;
    
    /** Creates a new ClimbingClub object. */
    public ClimbingClub()
    {
        climbList = new ArrayList<ClimbInfo>();
    }
    
    /** Adds a new climb with name peakName and time climbTime to the list of climbs.
    * @param peakName the name of the mountain peak climbed
    * @param climbTime the number of minutes taken to complete the climb
    */
    public void addClimb(String peakName, int climbTime)
    { /* to be implemented in part (1) with ClimbInfo objects in alphabetical order by name */
        if (climbList.size() == 0){
            climbList.add(new ClimbInfo(peakName, climbTime));
        }
        else{
        for (int i = 0; i < climbList.size(); i++){
            if (peakName.compareTo(climbList.get(i).getName()) < 0){
                climbList.add(i, new ClimbInfo(peakName, climbTime));
                break;
            }
        }
        if (peakName.compareTo(climbList.get(climbList.size()-1).getName()) >=0)
            {
            climbList.add(new ClimbInfo(peakName, climbTime));
            }
        }
    }
    /** @return the number of distinct names in the list of climbs */
    public int distinctPeakNames()
    { /* implementation shown in directions file */
      return -1;
    }

}
