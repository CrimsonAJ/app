.class public final Lcom/google/android/gms/internal/measurement/b4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/google/android/gms/internal/measurement/a4;


# static fields
.field public static final a:Lcom/google/android/gms/internal/measurement/J1;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    invoke-static {}, Lcom/google/android/gms/internal/measurement/F1;->a()Landroid/net/Uri;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    new-instance v1, LA6/i;

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    invoke-direct {v1, v0, v2, v2}, LA6/i;-><init>(Landroid/net/Uri;ZZ)V

    .line 9
    .line 10
    .line 11
    const-string v0, "measurement.client.sessions.background_sessions_enabled"

    .line 12
    .line 13
    invoke-virtual {v1, v0, v2}, LA6/i;->i(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/J1;

    .line 14
    .line 15
    .line 16
    const-string v0, "measurement.client.sessions.enable_fix_background_engagement"

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    invoke-virtual {v1, v0, v3}, LA6/i;->i(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/J1;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    sput-object v0, Lcom/google/android/gms/internal/measurement/b4;->a:Lcom/google/android/gms/internal/measurement/J1;

    .line 24
    .line 25
    const-string v0, "measurement.client.sessions.immediate_start_enabled_foreground"

    .line 26
    .line 27
    invoke-virtual {v1, v0, v2}, LA6/i;->i(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/J1;

    .line 28
    .line 29
    .line 30
    const-string v0, "measurement.client.sessions.enable_pause_engagement_in_background"

    .line 31
    .line 32
    invoke-virtual {v1, v0, v2}, LA6/i;->i(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/J1;

    .line 33
    .line 34
    .line 35
    const-string v0, "measurement.client.sessions.session_id_enabled"

    .line 36
    .line 37
    invoke-virtual {v1, v0, v2}, LA6/i;->i(Ljava/lang/String;Z)Lcom/google/android/gms/internal/measurement/J1;

    .line 38
    .line 39
    .line 40
    const-string v0, "measurement.id.client.sessions.enable_fix_background_engagement"

    .line 41
    .line 42
    const-wide/16 v2, 0x0

    .line 43
    .line 44
    invoke-virtual {v1, v2, v3, v0}, LA6/i;->g(JLjava/lang/String;)Lcom/google/android/gms/internal/measurement/J1;

    .line 45
    .line 46
    .line 47
    return-void
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
.end method
