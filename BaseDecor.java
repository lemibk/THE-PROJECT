abstract class BaseDecor implements Nameable {
        protected Nameable nameable;

        public BaseDecor(Nameable nameable) {
            this.nameable = nameable;
        }



        public String CorrectName() {
            return nameable.getCorrectName();
        }

    }

