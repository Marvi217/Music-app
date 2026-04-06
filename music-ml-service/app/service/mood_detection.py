class MoodDetectionService:
    def update_mood(user_id: str, event_type: str, track_energy: float, track_valence: float, current_mood: dict)
    def calculate_ewma(current_value: float, new_value: float, alpha: float)
    def map_to_mood_state(energy: float, stability: float, novelty: float)
    def update_energy_axis(current_mood: dict, track_energy: float)
    def update_stability_axis(current_mood: dict, event_type: str)
    def update_novelty_axis(current_mood: dict, track_features: dict)