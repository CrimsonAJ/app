.class public final Lcom/google/android/gms/internal/cast/x0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final i:Ly4/b;

.field public static final j:Ljava/lang/String;

.field public static k:Lcom/google/android/gms/internal/cast/x0;


# instance fields
.field public final a:Lcom/google/android/gms/internal/cast/Y;

.field public final b:Landroid/content/SharedPreferences;

.field public final c:Ljava/lang/String;

.field public final d:Lcom/google/android/gms/internal/cast/y;

.field public final e:LT4/d;

.field public final f:Ljava/util/HashSet;

.field public final g:Ljava/util/HashSet;

.field public h:J


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Ly4/b;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "FeatureUsageAnalytics"

    .line 5
    .line 6
    invoke-direct {v0, v2, v1}, Ly4/b;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    sput-object v0, Lcom/google/android/gms/internal/cast/x0;->i:Ly4/b;

    .line 10
    .line 11
    const-string v0, "22.1.0"

    .line 12
    .line 13
    sput-object v0, Lcom/google/android/gms/internal/cast/x0;->j:Ljava/lang/String;

    .line 14
    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public constructor <init>(Landroid/content/SharedPreferences;Lcom/google/android/gms/internal/cast/Y;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/google/android/gms/internal/cast/x0;->b:Landroid/content/SharedPreferences;

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/internal/cast/x0;->a:Lcom/google/android/gms/internal/cast/Y;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/google/android/gms/internal/cast/x0;->c:Ljava/lang/String;

    .line 9
    .line 10
    new-instance p1, Ljava/util/HashSet;

    .line 11
    .line 12
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lcom/google/android/gms/internal/cast/x0;->f:Ljava/util/HashSet;

    .line 16
    .line 17
    new-instance p1, Ljava/util/HashSet;

    .line 18
    .line 19
    invoke-direct {p1}, Ljava/util/HashSet;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lcom/google/android/gms/internal/cast/x0;->g:Ljava/util/HashSet;

    .line 23
    .line 24
    new-instance p1, LT4/d;

    .line 25
    .line 26
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 27
    .line 28
    .line 29
    move-result-object p2

    .line 30
    const/4 p3, 0x4

    .line 31
    invoke-direct {p1, p2, p3}, LT4/d;-><init>(Landroid/os/Looper;I)V

    .line 32
    .line 33
    .line 34
    iput-object p1, p0, Lcom/google/android/gms/internal/cast/x0;->e:LT4/d;

    .line 35
    .line 36
    new-instance p1, Lcom/google/android/gms/internal/cast/y;

    .line 37
    .line 38
    const/4 p2, 0x3

    .line 39
    invoke-direct {p1, p2, p0}, Lcom/google/android/gms/internal/cast/y;-><init>(ILjava/lang/Object;)V

    .line 40
    .line 41
    .line 42
    iput-object p1, p0, Lcom/google/android/gms/internal/cast/x0;->d:Lcom/google/android/gms/internal/cast/y;

    .line 43
    .line 44
    return-void
    .line 45
    .line 46
    .line 47
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
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
.end method

.method public static a(Lcom/google/android/gms/internal/cast/y0;)V
    .locals 5

    .line 1
    sget-boolean v0, Lcom/google/android/gms/internal/cast/Y;->k:Z

    .line 2
    .line 3
    if-eqz v0, :cond_2

    .line 4
    .line 5
    sget-object v0, Lcom/google/android/gms/internal/cast/x0;->k:Lcom/google/android/gms/internal/cast/x0;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    goto :goto_1

    .line 10
    :cond_0
    iget v1, p0, Lcom/google/android/gms/internal/cast/y0;->a:I

    .line 11
    .line 12
    invoke-static {v1}, Ljava/lang/Integer;->toString(I)Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    iget-object v2, v0, Lcom/google/android/gms/internal/cast/x0;->b:Landroid/content/SharedPreferences;

    .line 17
    .line 18
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    const-string v4, "feature_usage_timestamp_reported_feature_"

    .line 23
    .line 24
    invoke-static {v4, v1}, Lu0/z;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    invoke-interface {v2, v4}, Landroid/content/SharedPreferences;->contains(Ljava/lang/String;)Z

    .line 29
    .line 30
    .line 31
    move-result v2

    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const-string v2, "feature_usage_timestamp_detected_feature_"

    .line 36
    .line 37
    invoke-static {v2, v1}, Lu0/z;->e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    move-result-object v4

    .line 41
    :goto_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 42
    .line 43
    .line 44
    move-result-wide v1

    .line 45
    invoke-interface {v3, v4, v1, v2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 46
    .line 47
    .line 48
    move-result-object v1

    .line 49
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 50
    .line 51
    .line 52
    iget-object v1, v0, Lcom/google/android/gms/internal/cast/x0;->f:Ljava/util/HashSet;

    .line 53
    .line 54
    invoke-virtual {v1, p0}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    .line 55
    .line 56
    .line 57
    iget-object p0, v0, Lcom/google/android/gms/internal/cast/x0;->e:LT4/d;

    .line 58
    .line 59
    iget-object v0, v0, Lcom/google/android/gms/internal/cast/x0;->d:Lcom/google/android/gms/internal/cast/y;

    .line 60
    .line 61
    invoke-virtual {p0, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 62
    .line 63
    .line 64
    :cond_2
    :goto_1
    return-void
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
.end method

.method public static b(Ljava/lang/String;)Lcom/google/android/gms/internal/cast/y0;
    .locals 1

    .line 1
    sget-object v0, Lcom/google/android/gms/internal/cast/y0;->b:Lcom/google/android/gms/internal/cast/y0;

    .line 2
    .line 3
    :try_start_0
    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result p0

    .line 7
    packed-switch p0, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    const/4 p0, 0x0

    .line 11
    return-object p0

    .line 12
    :pswitch_0
    sget-object p0, Lcom/google/android/gms/internal/cast/y0;->E0:Lcom/google/android/gms/internal/cast/y0;

    .line 13
    .line 14
    return-object p0

    .line 15
    :pswitch_1
    sget-object p0, Lcom/google/android/gms/internal/cast/y0;->D0:Lcom/google/android/gms/internal/cast/y0;

    .line 16
    .line 17
    return-object p0

    .line 18
    :pswitch_2
    sget-object p0, Lcom/google/android/gms/internal/cast/y0;->C0:Lcom/google/android/gms/internal/cast/y0;

    .line 19
    .line 20
    return-object p0

    .line 21
    :pswitch_3
    sget-object p0, Lcom/google/android/gms/internal/cast/y0;->B0:Lcom/google/android/gms/internal/cast/y0;

    .line 22
    .line 23
    return-object p0

    .line 24
    :pswitch_4
    sget-object p0, Lcom/google/android/gms/internal/cast/y0;->A0:Lcom/google/android/gms/internal/cast/y0;

    .line 25
    .line 26
    return-object p0

    .line 27
    :pswitch_5
    sget-object p0, Lcom/google/android/gms/internal/cast/y0;->z0:Lcom/google/android/gms/internal/cast/y0;

    .line 28
    .line 29
    return-object p0

    .line 30
    :pswitch_6
    sget-object p0, Lcom/google/android/gms/internal/cast/y0;->y0:Lcom/google/android/gms/internal/cast/y0;

    .line 31
    .line 32
    return-object p0

    .line 33
    :pswitch_7
    sget-object p0, Lcom/google/android/gms/internal/cast/y0;->x0:Lcom/google/android/gms/internal/cast/y0;

    .line 34
    .line 35
    return-object p0

    .line 36
    :pswitch_8
    sget-object p0, Lcom/google/android/gms/internal/cast/y0;->w0:Lcom/google/android/gms/internal/cast/y0;

    .line 37
    .line 38
    return-object p0

    .line 39
    :pswitch_9
    sget-object p0, Lcom/google/android/gms/internal/cast/y0;->v0:Lcom/google/android/gms/internal/cast/y0;

    .line 40
    .line 41
    return-object p0

    .line 42
    :pswitch_a
    sget-object p0, Lcom/google/android/gms/internal/cast/y0;->u0:Lcom/google/android/gms/internal/cast/y0;

    .line 43
    .line 44
    return-object p0

    .line 45
    :pswitch_b
    sget-object p0, Lcom/google/android/gms/internal/cast/y0;->t0:Lcom/google/android/gms/internal/cast/y0;

    .line 46
    .line 47
    return-object p0

    .line 48
    :pswitch_c
    sget-object p0, Lcom/google/android/gms/internal/cast/y0;->s0:Lcom/google/android/gms/internal/cast/y0;

    .line 49
    .line 50
    return-object p0

    .line 51
    :pswitch_d
    sget-object p0, Lcom/google/android/gms/internal/cast/y0;->r0:Lcom/google/android/gms/internal/cast/y0;

    .line 52
    .line 53
    return-object p0

    .line 54
    :pswitch_e
    sget-object p0, Lcom/google/android/gms/internal/cast/y0;->q0:Lcom/google/android/gms/internal/cast/y0;

    .line 55
    .line 56
    return-object p0

    .line 57
    :pswitch_f
    sget-object p0, Lcom/google/android/gms/internal/cast/y0;->p0:Lcom/google/android/gms/internal/cast/y0;

    .line 58
    .line 59
    return-object p0

    .line 60
    :pswitch_10
    sget-object p0, Lcom/google/android/gms/internal/cast/y0;->o0:Lcom/google/android/gms/internal/cast/y0;

    .line 61
    .line 62
    return-object p0

    .line 63
    :pswitch_11
    sget-object p0, Lcom/google/android/gms/internal/cast/y0;->n0:Lcom/google/android/gms/internal/cast/y0;

    .line 64
    .line 65
    return-object p0

    .line 66
    :pswitch_12
    sget-object p0, Lcom/google/android/gms/internal/cast/y0;->m0:Lcom/google/android/gms/internal/cast/y0;

    .line 67
    .line 68
    return-object p0

    .line 69
    :pswitch_13
    sget-object p0, Lcom/google/android/gms/internal/cast/y0;->l0:Lcom/google/android/gms/internal/cast/y0;

    .line 70
    .line 71
    return-object p0

    .line 72
    :pswitch_14
    sget-object p0, Lcom/google/android/gms/internal/cast/y0;->k0:Lcom/google/android/gms/internal/cast/y0;

    .line 73
    .line 74
    return-object p0

    .line 75
    :pswitch_15
    sget-object p0, Lcom/google/android/gms/internal/cast/y0;->j0:Lcom/google/android/gms/internal/cast/y0;

    .line 76
    .line 77
    return-object p0

    .line 78
    :pswitch_16
    sget-object p0, Lcom/google/android/gms/internal/cast/y0;->i0:Lcom/google/android/gms/internal/cast/y0;

    .line 79
    .line 80
    return-object p0

    .line 81
    :pswitch_17
    sget-object p0, Lcom/google/android/gms/internal/cast/y0;->h0:Lcom/google/android/gms/internal/cast/y0;

    .line 82
    .line 83
    return-object p0

    .line 84
    :pswitch_18
    sget-object p0, Lcom/google/android/gms/internal/cast/y0;->g0:Lcom/google/android/gms/internal/cast/y0;

    .line 85
    .line 86
    return-object p0

    .line 87
    :pswitch_19
    sget-object p0, Lcom/google/android/gms/internal/cast/y0;->f0:Lcom/google/android/gms/internal/cast/y0;

    .line 88
    .line 89
    return-object p0

    .line 90
    :pswitch_1a
    sget-object p0, Lcom/google/android/gms/internal/cast/y0;->Z:Lcom/google/android/gms/internal/cast/y0;

    .line 91
    .line 92
    return-object p0

    .line 93
    :pswitch_1b
    sget-object p0, Lcom/google/android/gms/internal/cast/y0;->Y:Lcom/google/android/gms/internal/cast/y0;

    .line 94
    .line 95
    return-object p0

    .line 96
    :pswitch_1c
    sget-object p0, Lcom/google/android/gms/internal/cast/y0;->X:Lcom/google/android/gms/internal/cast/y0;

    .line 97
    .line 98
    return-object p0

    .line 99
    :pswitch_1d
    sget-object p0, Lcom/google/android/gms/internal/cast/y0;->D:Lcom/google/android/gms/internal/cast/y0;

    .line 100
    .line 101
    return-object p0

    .line 102
    :pswitch_1e
    sget-object p0, Lcom/google/android/gms/internal/cast/y0;->C:Lcom/google/android/gms/internal/cast/y0;

    .line 103
    .line 104
    return-object p0

    .line 105
    :pswitch_1f
    sget-object p0, Lcom/google/android/gms/internal/cast/y0;->B:Lcom/google/android/gms/internal/cast/y0;

    .line 106
    .line 107
    return-object p0

    .line 108
    :pswitch_20
    sget-object p0, Lcom/google/android/gms/internal/cast/y0;->A:Lcom/google/android/gms/internal/cast/y0;

    .line 109
    .line 110
    return-object p0

    .line 111
    :pswitch_21
    sget-object p0, Lcom/google/android/gms/internal/cast/y0;->z:Lcom/google/android/gms/internal/cast/y0;

    .line 112
    .line 113
    return-object p0

    .line 114
    :pswitch_22
    sget-object p0, Lcom/google/android/gms/internal/cast/y0;->y:Lcom/google/android/gms/internal/cast/y0;

    .line 115
    .line 116
    return-object p0

    .line 117
    :pswitch_23
    sget-object p0, Lcom/google/android/gms/internal/cast/y0;->x:Lcom/google/android/gms/internal/cast/y0;

    .line 118
    .line 119
    return-object p0

    .line 120
    :pswitch_24
    sget-object p0, Lcom/google/android/gms/internal/cast/y0;->w:Lcom/google/android/gms/internal/cast/y0;

    .line 121
    .line 122
    return-object p0

    .line 123
    :pswitch_25
    sget-object p0, Lcom/google/android/gms/internal/cast/y0;->v:Lcom/google/android/gms/internal/cast/y0;

    .line 124
    .line 125
    return-object p0

    .line 126
    :pswitch_26
    sget-object p0, Lcom/google/android/gms/internal/cast/y0;->u:Lcom/google/android/gms/internal/cast/y0;

    .line 127
    .line 128
    return-object p0

    .line 129
    :pswitch_27
    sget-object p0, Lcom/google/android/gms/internal/cast/y0;->t:Lcom/google/android/gms/internal/cast/y0;

    .line 130
    .line 131
    return-object p0

    .line 132
    :pswitch_28
    sget-object p0, Lcom/google/android/gms/internal/cast/y0;->s:Lcom/google/android/gms/internal/cast/y0;

    .line 133
    .line 134
    return-object p0

    .line 135
    :pswitch_29
    sget-object p0, Lcom/google/android/gms/internal/cast/y0;->r:Lcom/google/android/gms/internal/cast/y0;

    .line 136
    .line 137
    return-object p0

    .line 138
    :pswitch_2a
    sget-object p0, Lcom/google/android/gms/internal/cast/y0;->q:Lcom/google/android/gms/internal/cast/y0;

    .line 139
    .line 140
    return-object p0

    .line 141
    :pswitch_2b
    sget-object p0, Lcom/google/android/gms/internal/cast/y0;->p:Lcom/google/android/gms/internal/cast/y0;

    .line 142
    .line 143
    return-object p0

    .line 144
    :pswitch_2c
    sget-object p0, Lcom/google/android/gms/internal/cast/y0;->o:Lcom/google/android/gms/internal/cast/y0;

    .line 145
    .line 146
    return-object p0

    .line 147
    :pswitch_2d
    sget-object p0, Lcom/google/android/gms/internal/cast/y0;->n:Lcom/google/android/gms/internal/cast/y0;

    .line 148
    .line 149
    return-object p0

    .line 150
    :pswitch_2e
    sget-object p0, Lcom/google/android/gms/internal/cast/y0;->m:Lcom/google/android/gms/internal/cast/y0;

    .line 151
    .line 152
    return-object p0

    .line 153
    :pswitch_2f
    sget-object p0, Lcom/google/android/gms/internal/cast/y0;->l:Lcom/google/android/gms/internal/cast/y0;

    .line 154
    .line 155
    return-object p0

    .line 156
    :pswitch_30
    sget-object p0, Lcom/google/android/gms/internal/cast/y0;->k:Lcom/google/android/gms/internal/cast/y0;

    .line 157
    .line 158
    return-object p0

    .line 159
    :pswitch_31
    sget-object p0, Lcom/google/android/gms/internal/cast/y0;->j:Lcom/google/android/gms/internal/cast/y0;

    .line 160
    .line 161
    return-object p0

    .line 162
    :pswitch_32
    sget-object p0, Lcom/google/android/gms/internal/cast/y0;->i:Lcom/google/android/gms/internal/cast/y0;

    .line 163
    .line 164
    return-object p0

    .line 165
    :pswitch_33
    sget-object p0, Lcom/google/android/gms/internal/cast/y0;->h:Lcom/google/android/gms/internal/cast/y0;

    .line 166
    .line 167
    return-object p0

    .line 168
    :pswitch_34
    sget-object p0, Lcom/google/android/gms/internal/cast/y0;->g:Lcom/google/android/gms/internal/cast/y0;

    .line 169
    .line 170
    return-object p0

    .line 171
    :pswitch_35
    sget-object p0, Lcom/google/android/gms/internal/cast/y0;->f:Lcom/google/android/gms/internal/cast/y0;

    .line 172
    .line 173
    return-object p0

    .line 174
    :pswitch_36
    sget-object p0, Lcom/google/android/gms/internal/cast/y0;->e:Lcom/google/android/gms/internal/cast/y0;

    .line 175
    .line 176
    return-object p0

    .line 177
    :pswitch_37
    sget-object p0, Lcom/google/android/gms/internal/cast/y0;->d:Lcom/google/android/gms/internal/cast/y0;

    .line 178
    .line 179
    return-object p0

    .line 180
    :pswitch_38
    sget-object p0, Lcom/google/android/gms/internal/cast/y0;->c:Lcom/google/android/gms/internal/cast/y0;
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 181
    .line 182
    return-object p0

    .line 183
    :catch_0
    :pswitch_39
    return-object v0

    .line 184
    nop

    .line 185
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_39
        :pswitch_38
        :pswitch_37
        :pswitch_36
        :pswitch_35
        :pswitch_34
        :pswitch_33
        :pswitch_32
        :pswitch_31
        :pswitch_30
        :pswitch_2f
        :pswitch_2e
        :pswitch_2d
        :pswitch_2c
        :pswitch_2b
        :pswitch_2a
        :pswitch_29
        :pswitch_28
        :pswitch_27
        :pswitch_26
        :pswitch_25
        :pswitch_24
        :pswitch_23
        :pswitch_22
        :pswitch_21
        :pswitch_20
        :pswitch_1f
        :pswitch_1e
        :pswitch_1d
        :pswitch_1c
        :pswitch_1b
        :pswitch_1a
        :pswitch_19
        :pswitch_18
        :pswitch_17
        :pswitch_16
        :pswitch_15
        :pswitch_14
        :pswitch_13
        :pswitch_12
        :pswitch_11
        :pswitch_10
        :pswitch_f
        :pswitch_e
        :pswitch_d
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
.end method


# virtual methods
.method public final c(Ljava/util/HashSet;)V
    .locals 2

    .line 1
    invoke-virtual {p1}, Ljava/util/HashSet;->isEmpty()Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    return-void

    .line 8
    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/cast/x0;->b:Landroid/content/SharedPreferences;

    .line 9
    .line 10
    invoke-interface {v0}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    invoke-virtual {p1}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    .line 20
    .line 21
    move-result v1

    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Ljava/lang/String;

    .line 29
    .line 30
    invoke-interface {v0, v1}, Landroid/content/SharedPreferences$Editor;->remove(Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 35
    .line 36
    .line 37
    return-void
    .line 38
.end method
