package android.arch.lifecycle;

import android.support.annotation.RestrictTo;
import android.support.annotation.RestrictTo.Scope;
import java.util.HashMap;
import java.util.Map;

@RestrictTo({Scope.LIBRARY_GROUP})
public class MethodCallsLogger {
    private Map<String, Integer> mCalledMethods = new HashMap();

    @RestrictTo({Scope.LIBRARY_GROUP})
    public boolean approveCall(String str, int i) {
        Integer num = (Integer) this.mCalledMethods.get(str);
        int intValue = num != null ? num.intValue() : 0;
        int i2 = (intValue & i) != 0 ? 1 : 0;
        this.mCalledMethods.put(str, Integer.valueOf(intValue | i));
        return i2 ^ 1;
    }
}
