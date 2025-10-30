.class public final synthetic Lt4/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD4/l;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lt4/A;

.field public final synthetic c:Ljava/lang/String;

.field public final synthetic d:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lt4/A;Ljava/lang/String;Ljava/lang/String;I)V
    .locals 0

    .line 1
    iput p4, p0, Lt4/w;->a:I

    iput-object p1, p0, Lt4/w;->b:Lt4/A;

    iput-object p2, p0, Lt4/w;->c:Ljava/lang/String;

    iput-object p3, p0, Lt4/w;->d:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final H(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 11

    .line 1
    const/4 v0, -0x1

    .line 2
    const/4 v1, 0x1

    .line 3
    const/4 v2, 0x0

    .line 4
    const/4 v3, 0x3

    .line 5
    iget v4, p0, Lt4/w;->a:I

    .line 6
    .line 7
    packed-switch v4, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v4, p0, Lt4/w;->c:Ljava/lang/String;

    .line 11
    .line 12
    iget-object v5, p0, Lt4/w;->d:Ljava/lang/String;

    .line 13
    .line 14
    check-cast p1, Ly4/w;

    .line 15
    .line 16
    check-cast p2, Lf5/i;

    .line 17
    .line 18
    iget-object v6, p0, Lt4/w;->b:Lt4/A;

    .line 19
    .line 20
    iget-object v7, v6, Lt4/A;->q:Ljava/util/concurrent/atomic/AtomicLong;

    .line 21
    .line 22
    iget-object v8, v6, Lt4/A;->B:Ljava/util/HashMap;

    .line 23
    .line 24
    invoke-virtual {v7}, Ljava/util/concurrent/atomic/AtomicLong;->incrementAndGet()J

    .line 25
    .line 26
    .line 27
    move-result-wide v9

    .line 28
    iget v6, v6, Lt4/A;->F:I

    .line 29
    .line 30
    if-ne v6, v3, :cond_0

    .line 31
    .line 32
    move v3, v1

    .line 33
    goto :goto_0

    .line 34
    :cond_0
    move v3, v2

    .line 35
    :goto_0
    const-string v6, "Not connected to device"

    .line 36
    .line 37
    invoke-static {v6, v3}, LF4/y;->j(Ljava/lang/String;Z)V

    .line 38
    .line 39
    .line 40
    :try_start_0
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 41
    .line 42
    .line 43
    move-result-object v3

    .line 44
    invoke-virtual {v8, v3, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 45
    .line 46
    .line 47
    iget-object v3, p1, LF4/e;->c:Landroid/content/Context;

    .line 48
    .line 49
    new-instance v3, LC4/g;

    .line 50
    .line 51
    invoke-direct {v3, v0, v0, v2, v1}, LC4/g;-><init>(IIIZ)V

    .line 52
    .line 53
    .line 54
    new-instance v0, LC4/f;

    .line 55
    .line 56
    invoke-direct {v0, v3}, LC4/f;-><init>(LC4/g;)V

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1}, LF4/e;->u()Landroid/os/IInterface;

    .line 60
    .line 61
    .line 62
    move-result-object p1

    .line 63
    check-cast p1, Ly4/g;

    .line 64
    .line 65
    invoke-virtual {p1}, LS4/a;->Q()Landroid/os/Parcel;

    .line 66
    .line 67
    .line 68
    move-result-object v1

    .line 69
    invoke-virtual {v1, v4}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1, v5}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1, v9, v10}, Landroid/os/Parcel;->writeLong(J)V

    .line 76
    .line 77
    .line 78
    invoke-static {v1, v0}, Lcom/google/android/gms/internal/cast/C;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 79
    .line 80
    .line 81
    const/16 v0, 0x9

    .line 82
    .line 83
    invoke-virtual {p1, v1, v0}, LS4/a;->i1(Landroid/os/Parcel;I)V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :catch_0
    move-exception p1

    .line 88
    invoke-static {v9, v10}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 89
    .line 90
    .line 91
    move-result-object v0

    .line 92
    invoke-virtual {v8, v0}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 93
    .line 94
    .line 95
    invoke-virtual {p2, p1}, Lf5/i;->a(Ljava/lang/Exception;)V

    .line 96
    .line 97
    .line 98
    :goto_1
    return-void

    .line 99
    :pswitch_0
    check-cast p1, Ly4/w;

    .line 100
    .line 101
    check-cast p2, Lf5/i;

    .line 102
    .line 103
    sget-object v4, Lt4/A;->G:Ly4/b;

    .line 104
    .line 105
    iget-object v4, p0, Lt4/w;->b:Lt4/A;

    .line 106
    .line 107
    iget v5, v4, Lt4/A;->F:I

    .line 108
    .line 109
    if-ne v5, v3, :cond_1

    .line 110
    .line 111
    move v3, v1

    .line 112
    goto :goto_2

    .line 113
    :cond_1
    move v3, v2

    .line 114
    :goto_2
    const-string v5, "Not connected to device"

    .line 115
    .line 116
    invoke-static {v5, v3}, LF4/y;->j(Ljava/lang/String;Z)V

    .line 117
    .line 118
    .line 119
    iget-object v3, p1, LF4/e;->c:Landroid/content/Context;

    .line 120
    .line 121
    new-instance v3, LC4/g;

    .line 122
    .line 123
    invoke-direct {v3, v0, v0, v2, v1}, LC4/g;-><init>(IIIZ)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1}, LF4/e;->u()Landroid/os/IInterface;

    .line 127
    .line 128
    .line 129
    move-result-object p1

    .line 130
    check-cast p1, Ly4/g;

    .line 131
    .line 132
    new-instance v0, LC4/f;

    .line 133
    .line 134
    invoke-direct {v0, v3}, LC4/f;-><init>(LC4/g;)V

    .line 135
    .line 136
    .line 137
    invoke-virtual {p1}, LS4/a;->Q()Landroid/os/Parcel;

    .line 138
    .line 139
    .line 140
    move-result-object v1

    .line 141
    iget-object v3, p0, Lt4/w;->c:Ljava/lang/String;

    .line 142
    .line 143
    invoke-virtual {v1, v3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 144
    .line 145
    .line 146
    iget-object v3, p0, Lt4/w;->d:Ljava/lang/String;

    .line 147
    .line 148
    invoke-virtual {v1, v3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    sget v3, Lcom/google/android/gms/internal/cast/C;->a:I

    .line 152
    .line 153
    invoke-virtual {v1, v2}, Landroid/os/Parcel;->writeInt(I)V

    .line 154
    .line 155
    .line 156
    invoke-static {v1, v0}, Lcom/google/android/gms/internal/cast/C;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 157
    .line 158
    .line 159
    const/16 v0, 0xe

    .line 160
    .line 161
    invoke-virtual {p1, v1, v0}, LS4/a;->i1(Landroid/os/Parcel;I)V

    .line 162
    .line 163
    .line 164
    iget-object p1, v4, Lt4/A;->r:Ljava/lang/Object;

    .line 165
    .line 166
    monitor-enter p1

    .line 167
    :try_start_1
    iget-object v0, v4, Lt4/A;->o:Lf5/i;

    .line 168
    .line 169
    if-eqz v0, :cond_2

    .line 170
    .line 171
    const/16 v0, 0x9ad

    .line 172
    .line 173
    invoke-virtual {v4, v0}, Lt4/A;->h(I)V

    .line 174
    .line 175
    .line 176
    goto :goto_3

    .line 177
    :catchall_0
    move-exception p2

    .line 178
    goto :goto_4

    .line 179
    :cond_2
    :goto_3
    iput-object p2, v4, Lt4/A;->o:Lf5/i;

    .line 180
    .line 181
    monitor-exit p1

    .line 182
    return-void

    .line 183
    :goto_4
    monitor-exit p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 184
    throw p2

    .line 185
    :pswitch_data_0
    .packed-switch 0x0
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
.end method
