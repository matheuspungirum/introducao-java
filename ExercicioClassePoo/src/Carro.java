public class Carro {
    private String cor;
    private String modelo;
    private float tanque;

    public Carro(String cor, String modelo, float tanque) {
        this.cor = cor;
        this.modelo = modelo;
        this.tanque = tanque;

    }
    public Carro (){
    }

    public String getCor(){
            return this.cor;
        }
        public void setCor(String c){
        this.cor = c;
        }
        public String getModelo(){
        return this.modelo;
        }
        public void setModelo(String m){
        this.modelo = m;
        }
        public float getTanque(){
        return this.tanque;
        }
        public void setTanque(float t){
        this.tanque = t;
        }

        public double totalValorCombustivel (float valorCombustivel){
        return getTanque() * valorCombustivel;
        }
}
