public class CostePersonal {

    static float calcularCosteDelPersonal(Trabajador[] listaTrabajadores) {
        if (listaTrabajadores == null) {
            throw new IllegalArgumentException("La lista de trabajadores no puede ser nula");
        }

        float costeFinal = 0;
        for (Trabajador trabajador : listaTrabajadores) {
            switch (trabajador.getTipoTrabajador()) {
                case Trabajador.DIRECTOR:
                case Trabajador.SUBDIRECTOR:
                    costeFinal += trabajador.getNomina();
                    break;
                default:
                    costeFinal += calcularCosteTotalTrabajador(trabajador);
                    break;
            }
        }
        return costeFinal;
    }

    private static float calcularCosteTotalTrabajador(Trabajador trabajador) {
        float costeHorasExtras = trabajador.getHorasExtras() * 20;
        return trabajador.getNomina() + costeHorasExtras;
    }
}

