package bean;

public class Annotation {
		
		private int AnnotationID;
		private float x_Coord;
		private float y_Coord;
		private String dateOfDiag;
		private int doctorId;
		private String diseaseCode;
		private String diseaseDesc;
		private int BID;
		private String extraDiseaseName;
		

		public int getAnnotationID() {
			return AnnotationID;
		}
		public void setAnnotationID(int annotationID) {
			AnnotationID = annotationID;
		}
		public float getX_Coord() {
			return x_Coord;
		}
		public void setX_Coord(float x_Coord) {
			this.x_Coord = x_Coord;
		}
		public float getY_Coord() {
			return y_Coord;
		}
		public void setY_Coord(float y_Coord) {
			this.y_Coord = y_Coord;
		}
		public String getDateOfDiag() {
			return dateOfDiag;
		}
		public void setDateOfDiag(String dateOfDiag) {
			this.dateOfDiag = dateOfDiag;
		}
		public int getDoctorId() {
			return doctorId;
		}
		public void setDoctorId(int doctorId) {
			this.doctorId = doctorId;
		}
		public String getDiseaseCode() {
			return diseaseCode;
		}
		public void setDiseaseCode(String diseaseCode) {
			this.diseaseCode = diseaseCode;
		}
		public String getDiseaseDesc() {
			return diseaseDesc;
		}
		public void setDiseaseDesc(String diseaseDesc) {
			this.diseaseDesc = diseaseDesc;
		}
		public int getBID() {
			return BID;
		}
		public void setBID(int BID) {
			this.BID = BID;
		}
		public String getExtraDiseaseName() {
			return extraDiseaseName;
		}
		public void setExtraDiseaseName(String extraDiseaseName) {
			this.extraDiseaseName = extraDiseaseName;
		}
		
		
		
}