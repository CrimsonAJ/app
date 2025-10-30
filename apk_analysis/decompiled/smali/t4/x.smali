.class public final synthetic Lt4/x;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LD4/l;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lt4/A;

.field public final synthetic c:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lt4/A;Ljava/lang/String;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, Lt4/x;->a:I

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt4/x;->b:Lt4/A;

    iput-object p2, p0, Lt4/x;->c:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Lt4/A;Ljava/lang/String;Lv4/h;)V
    .locals 0

    const/4 p3, 0x0

    iput p3, p0, Lt4/x;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lt4/x;->b:Lt4/A;

    iput-object p2, p0, Lt4/x;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final H(Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 8

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, -0x1

    .line 3
    const/4 v2, 0x1

    .line 4
    const/4 v3, 0x0

    .line 5
    iget v4, p0, Lt4/x;->a:I

    .line 6
    .line 7
    packed-switch v4, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    iget-object v4, p0, Lt4/x;->b:Lt4/A;

    .line 11
    .line 12
    iget-object v5, p0, Lt4/x;->c:Ljava/lang/String;

    .line 13
    .line 14
    check-cast p1, Ly4/w;

    .line 15
    .line 16
    check-cast p2, Lf5/i;

    .line 17
    .line 18
    sget-object v6, Lt4/A;->G:Ly4/b;

    .line 19
    .line 20
    iget v6, v4, Lt4/A;->F:I

    .line 21
    .line 22
    const/4 v7, 0x3

    .line 23
    if-ne v6, v7, :cond_0

    .line 24
    .line 25
    move v6, v2

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    move v6, v3

    .line 28
    :goto_0
    const-string v7, "Not connected to device"

    .line 29
    .line 30
    invoke-static {v7, v6}, LF4/y;->j(Ljava/lang/String;Z)V

    .line 31
    .line 32
    .line 33
    iget-object v6, p1, LF4/e;->c:Landroid/content/Context;

    .line 34
    .line 35
    new-instance v6, LC4/g;

    .line 36
    .line 37
    invoke-direct {v6, v1, v1, v3, v2}, LC4/g;-><init>(IIIZ)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, LF4/e;->u()Landroid/os/IInterface;

    .line 41
    .line 42
    .line 43
    move-result-object p1

    .line 44
    check-cast p1, Ly4/g;

    .line 45
    .line 46
    new-instance v1, LC4/f;

    .line 47
    .line 48
    invoke-direct {v1, v6}, LC4/f;-><init>(LC4/g;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, LS4/a;->Q()Landroid/os/Parcel;

    .line 52
    .line 53
    .line 54
    move-result-object v2

    .line 55
    invoke-virtual {v2, v5}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-static {v2, v1}, Lcom/google/android/gms/internal/cast/C;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 59
    .line 60
    .line 61
    const/4 v1, 0x5

    .line 62
    invoke-virtual {p1, v2, v1}, LS4/a;->i1(Landroid/os/Parcel;I)V

    .line 63
    .line 64
    .line 65
    iget-object v5, v4, Lt4/A;->s:Ljava/lang/Object;

    .line 66
    .line 67
    monitor-enter v5

    .line 68
    :try_start_0
    iget-object p1, v4, Lt4/A;->p:Lf5/i;

    .line 69
    .line 70
    if-eqz p1, :cond_1

    .line 71
    .line 72
    new-instance p1, Lcom/google/android/gms/common/api/Status;

    .line 73
    .line 74
    const/16 v1, 0x7d1

    .line 75
    .line 76
    invoke-direct {p1, v1, v0, v0, v0}, Lcom/google/android/gms/common/api/Status;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;LB4/b;)V

    .line 77
    .line 78
    .line 79
    invoke-static {p1}, LF4/y;->l(Lcom/google/android/gms/common/api/Status;)LC4/e;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    invoke-virtual {p2, p1}, Lf5/i;->a(Ljava/lang/Exception;)V

    .line 84
    .line 85
    .line 86
    monitor-exit v5

    .line 87
    goto :goto_1

    .line 88
    :catchall_0
    move-exception p1

    .line 89
    goto :goto_2

    .line 90
    :cond_1
    iput-object p2, v4, Lt4/A;->p:Lf5/i;

    .line 91
    .line 92
    monitor-exit v5

    .line 93
    :goto_1
    return-void

    .line 94
    :goto_2
    monitor-exit v5
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 95
    throw p1

    .line 96
    :pswitch_0
    check-cast p1, Ly4/w;

    .line 97
    .line 98
    check-cast p2, Lf5/i;

    .line 99
    .line 100
    iget-object v4, p0, Lt4/x;->b:Lt4/A;

    .line 101
    .line 102
    iget v4, v4, Lt4/A;->F:I

    .line 103
    .line 104
    if-eq v4, v2, :cond_2

    .line 105
    .line 106
    move v4, v2

    .line 107
    goto :goto_3

    .line 108
    :cond_2
    move v4, v3

    .line 109
    :goto_3
    const-string v5, "Not active connection"

    .line 110
    .line 111
    invoke-static {v5, v4}, LF4/y;->j(Ljava/lang/String;Z)V

    .line 112
    .line 113
    .line 114
    iget-object v4, p1, LF4/e;->c:Landroid/content/Context;

    .line 115
    .line 116
    new-instance v4, LC4/g;

    .line 117
    .line 118
    invoke-direct {v4, v1, v1, v3, v2}, LC4/g;-><init>(IIIZ)V

    .line 119
    .line 120
    .line 121
    new-instance v1, LC4/f;

    .line 122
    .line 123
    invoke-direct {v1, v4}, LC4/f;-><init>(LC4/g;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p1}, LF4/e;->u()Landroid/os/IInterface;

    .line 127
    .line 128
    .line 129
    move-result-object v2

    .line 130
    check-cast v2, Ly4/g;

    .line 131
    .line 132
    iget-object v3, p0, Lt4/x;->c:Ljava/lang/String;

    .line 133
    .line 134
    invoke-virtual {v2}, LS4/a;->Q()Landroid/os/Parcel;

    .line 135
    .line 136
    .line 137
    move-result-object v4

    .line 138
    invoke-virtual {v4, v3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    invoke-static {v4, v1}, Lcom/google/android/gms/internal/cast/C;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 142
    .line 143
    .line 144
    const/16 v5, 0xc

    .line 145
    .line 146
    invoke-virtual {v2, v4, v5}, LS4/a;->i1(Landroid/os/Parcel;I)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {p1}, LF4/e;->u()Landroid/os/IInterface;

    .line 150
    .line 151
    .line 152
    move-result-object p1

    .line 153
    check-cast p1, Ly4/g;

    .line 154
    .line 155
    invoke-virtual {p1}, LS4/a;->Q()Landroid/os/Parcel;

    .line 156
    .line 157
    .line 158
    move-result-object v2

    .line 159
    invoke-virtual {v2, v3}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 160
    .line 161
    .line 162
    invoke-static {v2, v1}, Lcom/google/android/gms/internal/cast/C;->c(Landroid/os/Parcel;Landroid/os/Parcelable;)V

    .line 163
    .line 164
    .line 165
    const/16 v1, 0xb

    .line 166
    .line 167
    invoke-virtual {p1, v2, v1}, LS4/a;->i1(Landroid/os/Parcel;I)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {p2, v0}, Lf5/i;->b(Ljava/lang/Object;)V

    .line 171
    .line 172
    .line 173
    return-void

    .line 174
    nop

    .line 175
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
