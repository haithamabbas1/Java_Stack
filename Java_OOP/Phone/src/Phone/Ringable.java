package Phone;

public interface Ringable {
		public default String ring() {
			return "wing wing";
		}
		
		public default String unlock() {
			return "UnLoCkEd";
		}
	}
