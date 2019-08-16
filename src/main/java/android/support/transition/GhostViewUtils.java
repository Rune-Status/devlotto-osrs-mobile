package android.support.transition;

import android.graphics.Matrix;
import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewGroup;

class GhostViewUtils {
    private GhostViewUtils() {
    }

    static GhostViewImpl addGhost(View view, ViewGroup viewGroup, Matrix matrix) {
        return VERSION.SDK_INT >= 21 ? GhostViewApi21.addGhost(view, viewGroup, matrix) : GhostViewApi14.addGhost(view, viewGroup);
    }

    static void removeGhost(View view) {
        if (VERSION.SDK_INT >= 21) {
            GhostViewApi21.removeGhost(view);
        } else {
            GhostViewApi14.removeGhost(view);
        }
    }
}
