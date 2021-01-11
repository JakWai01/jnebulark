package space.nebulark.jnebulark;

import org.teavm.flavour.routing.Routing;
import org.teavm.flavour.templates.BindTemplate;
import org.teavm.jso.browser.Window;
import org.teavm.jso.typedarrays.Uint8Array;

@BindTemplate("templates/webnetesOverview.html")
public class WebnetesOverviewView {
    public boolean visible = true;
    public boolean createVisible = true;
    public boolean fileVisible = true;
    public boolean inviteVisible = true;

    public void toWebnetesOverview() {
        Routing.open(IRoute.class).webnetesOverview();
    }

    public void toWebnetesExplore() {
        Routing.open(IRoute.class).webnetesExplore();
    }

    public void toWebnetesConfig() {
        Routing.open(IRoute.class).webnetesConfig();
    }

    public void toCluster() {
        Window window = Window.current();
        window.getLocation().replace("https://webnetesctl.vercel.app/");
    }

    public void setHamburgerVisible() {
        boolean otherVisible = !visible;
        this.visible = otherVisible;
    }

    public void setCreateModalVisible() {
        boolean otherVisible = !createVisible;
        this.createVisible = otherVisible;
    }

    public void setInviteModalVisible() {
        boolean otherVisible = !inviteVisible;
        this.inviteVisible = otherVisible;
    }

    public void setFileModalVisible() {
        boolean otherVisible = !fileVisible;
        this.fileVisible = otherVisible;
    }

    public void close() {
        return;
    }

    public String createRessources(String ressources) {
        return ressources;
    }

    public void deleteRessources(String ressources) {
        return;
    }

    public String open(String ressources) {
        return ressources;
    }

    public String seedFile(String label, String name, String repository, Uint8Array fileInstance) {
        return "seededFile";
    }
}