class RecommendationService:
    def predict_next(user_id: str, current_track_id: str, mood_vector: dict)
    def get_top_candidates(user_id: str)
    def rerank_candidates(candidates: list, mood_vector: dict)
    def calculate_mood_match_score(mood_vector: dict, track_features: dict)
    def calculate_final_score(collaborative_score: float, mood_match_score: float, genre_affinity: float, freshness: float)
    def get_user_track_weights(user_id: str)