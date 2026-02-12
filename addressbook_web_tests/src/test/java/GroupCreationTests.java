import org.junit.jupiter.api.Test;

public class GroupCreationTests extends TestBase {


    @Test
    public void CanCreateGroup() {
        openGroupsPage();
        createGroup("GroupName1", "header", "footer");
    }

    @Test
    public void CanCreateGroupWithEmptyName() {
        openGroupsPage();
        createGroup("", "", "");
    }
}
