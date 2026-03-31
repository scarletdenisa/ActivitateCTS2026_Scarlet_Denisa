package cts.builder;

public class AutobuzLinie{
    protected final String model;
    protected final String sofer;
    protected final boolean opriri;
    protected final boolean deschidereUsi;
    protected final String textAfisat;


    private AutobuzLinie(AutobuzLinieBuilder builder) {
        this.model = builder.model;
        this.sofer = builder.sofer;
        this.opriri = builder.opriri;
        this.deschidereUsi = builder.deschidereUsi;
        this.textAfisat = builder.textAfisat;
    }

    public String getModel() {
        return model;
    }

    public String getSofer() {
        return sofer;
    }

    public boolean isOpriri() {
        return opriri;
    }

    public boolean isDeschidereUsi() {
        return deschidereUsi;
    }

    public String getTextAfisat() {
        return textAfisat;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AutobuzLinie{");
        sb.append("model='").append(model).append('\'');
        sb.append(", sofer='").append(sofer).append('\'');
        sb.append(", opriri=").append(opriri);
        sb.append(", deschidereUsi=").append(deschidereUsi);
        sb.append(", textAfisat='").append(textAfisat).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static AutobuzLinieBuilder builder(String model,String sofer){
        return new AutobuzLinieBuilder(model,sofer);
    }

    public static class AutobuzLinieBuilder implements Builder{

        protected  String model;
        protected  String sofer;
        protected  boolean opriri=false;
        protected  boolean deschidereUsi=false;
        protected  String textAfisat="";

        public AutobuzLinieBuilder(String model, String sofer) {
            this.model = model;
            this.sofer = sofer;

        }

        public AutobuzLinieBuilder setModel(String model) {
            this.model = model;
            return this;
        }

        public AutobuzLinieBuilder setSofer(String sofer) {
            this.sofer = sofer;
            return this;
        }

        public AutobuzLinieBuilder setOpriri(boolean opriri) {
            this.opriri = opriri;
            return this;
        }

        public AutobuzLinieBuilder setDeschidereUsi(boolean deschidereUsi) {
            this.deschidereUsi = deschidereUsi;
            return this;
        }

        public AutobuzLinieBuilder setTextAfisat(String textAfisat) {
            this.textAfisat = textAfisat;
            return this;
        }

        @Override
        public AutobuzLinie build() {
            return new AutobuzLinie(this);
        }
    }
}
