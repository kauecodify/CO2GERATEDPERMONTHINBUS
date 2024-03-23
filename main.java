public class CalculoCO2Onibus {
    public static void main(String[] args) {
    // Dados do ônibus
    double consumoCombustivelPorKm = 0.2; // Consumo de combustível por quilômetro em litros
    double emissaoCO2PorLitroDiesel = 2.68; // Emissão de CO2 por litro de diesel em kg
    
        // Dados do mês
        int diasNoMes = 30; // Número de dias no mês
        int quilometrosPorDia = 100; // Número de quilômetros percorridos por dia
    
        // Calculando quilômetros percorridos no mês
        int quilometrosPorMes = quilometrosPorDia * diasNoMes;
    
        // Calculando consumo de combustível no mês
        double consumoCombustivelPorMes = consumoCombustivelPorKm * quilometrosPorMes;
    
        // Calculando emissão de CO2 no mês
        double emissaoCO2PorMes = consumoCombustivelPorMes * emissaoCO2PorLitroDiesel;
    
        // Exibindo resultados
        System.out.println("Quilômetros percorridos no mês: " + quilometrosPorMes);
        System.out.println("Consumo de combustível no mês (litros): " + consumoCombustivelPorMes);
        System.out.println("Emissão de CO2 no mês (kg): " + emissaoCO2PorMes);
    }
    
    }