class CassandraClient:
    def connect()
    def disconnect()
    def get_user_track_weights(user_id: str)
    def upsert_user_track_weights(user_id: str, track_id: str, weight: float)
    def get_active_users(hours: int)
    def get_mood_history(user_id: str)
    def upsert_mood_history(user_id: str, mood_vector: dict)