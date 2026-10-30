
class Solution {
    public int minNumberOfHours(int initialEnergy, int initialExperience,
                                int[] energy, int[] experience) {

        int hours = 0;

        int currentEnergy = initialEnergy;
        int currentExperience = initialExperience;

        for (int i = 0; i < energy.length; i++) {

            if (currentEnergy <= energy[i]) {
                int needed = energy[i] - currentEnergy + 1;
                hours += needed;
                currentEnergy += needed;
            }

            if (currentExperience <= experience[i]) {
                int needed = experience[i] - currentExperience + 1;
                hours += needed;
                currentExperience += needed;
            }

            currentEnergy -= energy[i];
            currentExperience += experience[i];
        }

        return hours;
    }
}
