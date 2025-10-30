.class public abstract Lu4/a;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Ljava/util/ArrayList;

.field public static final b:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "The log tag cannot be null or empty."

    .line 2
    .line 3
    const-string v1, "CastButtonFactory"

    .line 4
    .line 5
    invoke-static {v1, v0}, LF4/y;->f(Ljava/lang/String;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    new-instance v0, Ljava/util/ArrayList;

    .line 14
    .line 15
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lu4/a;->a:Ljava/util/ArrayList;

    .line 19
    .line 20
    new-instance v0, Ljava/lang/Object;

    .line 21
    .line 22
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 23
    .line 24
    .line 25
    sput-object v0, Lu4/a;->b:Ljava/lang/Object;

    .line 26
    .line 27
    return-void
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public static a(Landroid/content/Context;Landroidx/mediarouter/app/MediaRouteButton;)V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    invoke-static {}, LF4/y;->d()V

    .line 4
    .line 5
    .line 6
    if-eqz p1, :cond_1

    .line 7
    .line 8
    invoke-static {}, LF4/y;->d()V

    .line 9
    .line 10
    .line 11
    sget-object v2, Lu4/b;->k:Ly4/b;

    .line 12
    .line 13
    invoke-static {}, LF4/y;->d()V

    .line 14
    .line 15
    .line 16
    const/4 v2, 0x0

    .line 17
    :try_start_0
    invoke-static {p0}, Lu4/b;->a(Landroid/content/Context;)Lu4/b;

    .line 18
    .line 19
    .line 20
    move-result-object p0
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    goto :goto_0

    .line 22
    :catch_0
    move-exception p0

    .line 23
    new-array v3, v1, [Ljava/lang/Object;

    .line 24
    .line 25
    aput-object p0, v3, v0

    .line 26
    .line 27
    sget-object p0, Lu4/b;->k:Ly4/b;

    .line 28
    .line 29
    iget-object v4, p0, Ly4/b;->a:Ljava/lang/String;

    .line 30
    .line 31
    const-string v5, "Failed to load module from Google Play services. Cast will not work properly. Might due to outdated Google Play services. Ignoring this failure silently."

    .line 32
    .line 33
    invoke-virtual {p0, v5, v3}, Ly4/b;->d(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object p0

    .line 37
    invoke-static {v4, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 38
    .line 39
    .line 40
    move-object p0, v2

    .line 41
    :goto_0
    if-eqz p0, :cond_0

    .line 42
    .line 43
    invoke-static {}, LF4/y;->d()V

    .line 44
    .line 45
    .line 46
    :try_start_1
    iget-object p0, p0, Lu4/b;->b:Lu4/n;

    .line 47
    .line 48
    check-cast p0, Lu4/l;

    .line 49
    .line 50
    invoke-virtual {p0}, LS4/a;->Q()Landroid/os/Parcel;

    .line 51
    .line 52
    .line 53
    move-result-object v3

    .line 54
    invoke-virtual {p0, v3, v1}, LS4/a;->f1(Landroid/os/Parcel;I)Landroid/os/Parcel;

    .line 55
    .line 56
    .line 57
    move-result-object p0

    .line 58
    sget-object v3, Landroid/os/Bundle;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 59
    .line 60
    invoke-static {p0, v3}, Lcom/google/android/gms/internal/cast/C;->a(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    check-cast v3, Landroid/os/Bundle;

    .line 65
    .line 66
    invoke-virtual {p0}, Landroid/os/Parcel;->recycle()V

    .line 67
    .line 68
    .line 69
    invoke-static {v3}, Lt0/w;->b(Landroid/os/Bundle;)Lt0/w;

    .line 70
    .line 71
    .line 72
    move-result-object v2
    :try_end_1
    .catch Landroid/os/RemoteException; {:try_start_1 .. :try_end_1} :catch_1

    .line 73
    goto :goto_1

    .line 74
    :catch_1
    move-exception p0

    .line 75
    const-class v3, Lu4/n;

    .line 76
    .line 77
    invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object v3

    .line 81
    const/4 v4, 0x2

    .line 82
    new-array v4, v4, [Ljava/lang/Object;

    .line 83
    .line 84
    const-string v5, "getMergedSelectorAsBundle"

    .line 85
    .line 86
    aput-object v5, v4, v0

    .line 87
    .line 88
    aput-object v3, v4, v1

    .line 89
    .line 90
    const-string v0, "Unable to call %s on %s."

    .line 91
    .line 92
    sget-object v1, Lu4/b;->k:Ly4/b;

    .line 93
    .line 94
    invoke-virtual {v1, p0, v0, v4}, Ly4/b;->a(Ljava/lang/Exception;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 95
    .line 96
    .line 97
    :goto_1
    if-eqz v2, :cond_0

    .line 98
    .line 99
    invoke-virtual {p1, v2}, Landroidx/mediarouter/app/MediaRouteButton;->setRouteSelector(Lt0/w;)V

    .line 100
    .line 101
    .line 102
    :cond_0
    sget-object p0, Lu4/a;->b:Ljava/lang/Object;

    .line 103
    .line 104
    monitor-enter p0

    .line 105
    :try_start_2
    sget-object v0, Lu4/a;->a:Ljava/util/ArrayList;

    .line 106
    .line 107
    new-instance v1, Ljava/lang/ref/WeakReference;

    .line 108
    .line 109
    invoke-direct {v1, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    monitor-exit p0

    .line 116
    goto :goto_2

    .line 117
    :catchall_0
    move-exception p1

    .line 118
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 119
    throw p1

    .line 120
    :cond_1
    :goto_2
    sget-object p0, Lcom/google/android/gms/internal/cast/y0;->g0:Lcom/google/android/gms/internal/cast/y0;

    .line 121
    .line 122
    invoke-static {p0}, Lcom/google/android/gms/internal/cast/x0;->a(Lcom/google/android/gms/internal/cast/y0;)V

    .line 123
    .line 124
    .line 125
    return-void
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
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
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
.end method
