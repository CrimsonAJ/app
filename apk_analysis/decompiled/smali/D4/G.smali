.class public final LD4/G;
.super LD4/y;
.source "SourceFile"


# instance fields
.field public final b:Lf5/i;

.field public final synthetic c:I

.field public final d:Ljava/lang/Object;


# direct methods
.method public constructor <init>(ILf5/i;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, LD4/I;-><init>(I)V

    .line 2
    iput-object p2, p0, LD4/G;->b:Lf5/i;

    return-void
.end method

.method public constructor <init>(LD4/C;Lf5/i;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LD4/G;->c:I

    const/4 v0, 0x3

    .line 4
    invoke-direct {p0, v0, p2}, LD4/G;-><init>(ILf5/i;)V

    iput-object p1, p0, LD4/G;->d:Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>(LD4/i;Lf5/i;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LD4/G;->c:I

    const/4 v0, 0x4

    .line 3
    invoke-direct {p0, v0, p2}, LD4/G;-><init>(ILf5/i;)V

    iput-object p1, p0, LD4/G;->d:Ljava/lang/Object;

    return-void
.end method

.method private final bridge synthetic i(LA1/g;Z)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
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
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
.end method

.method private final bridge synthetic j(LA1/g;Z)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
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
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
.end method


# virtual methods
.method public final a(Lcom/google/android/gms/common/api/Status;)V
    .locals 1

    .line 1
    new-instance v0, LC4/e;

    .line 2
    .line 3
    invoke-direct {v0, p1}, LC4/e;-><init>(Lcom/google/android/gms/common/api/Status;)V

    .line 4
    .line 5
    .line 6
    iget-object p1, p0, LD4/G;->b:Lf5/i;

    .line 7
    .line 8
    invoke-virtual {p1, v0}, Lf5/i;->c(Ljava/lang/Exception;)Z

    .line 9
    .line 10
    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
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
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public final b(Ljava/lang/RuntimeException;)V
    .locals 1

    .line 1
    iget-object v0, p0, LD4/G;->b:Lf5/i;

    .line 2
    .line 3
    invoke-virtual {v0, p1}, Lf5/i;->c(Ljava/lang/Exception;)Z

    .line 4
    .line 5
    .line 6
    return-void
    .line 7
    .line 8
    .line 9
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
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
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public final c(LD4/t;)V
    .locals 1

    .line 1
    :try_start_0
    invoke-virtual {p0, p1}, LD4/G;->h(LD4/t;)V
    :try_end_0
    .catch Landroid/os/DeadObjectException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 2
    .line 3
    .line 4
    return-void

    .line 5
    :catch_0
    move-exception p1

    .line 6
    iget-object v0, p0, LD4/G;->b:Lf5/i;

    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lf5/i;->c(Ljava/lang/Exception;)Z

    .line 9
    .line 10
    .line 11
    return-void

    .line 12
    :catch_1
    move-exception p1

    .line 13
    invoke-static {p1}, LD4/I;->e(Landroid/os/RemoteException;)Lcom/google/android/gms/common/api/Status;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    invoke-virtual {p0, p1}, LD4/G;->a(Lcom/google/android/gms/common/api/Status;)V

    .line 18
    .line 19
    .line 20
    return-void

    .line 21
    :catch_2
    move-exception p1

    .line 22
    invoke-static {p1}, LD4/I;->e(Landroid/os/RemoteException;)Lcom/google/android/gms/common/api/Status;

    .line 23
    .line 24
    .line 25
    move-result-object v0

    .line 26
    invoke-virtual {p0, v0}, LD4/G;->a(Lcom/google/android/gms/common/api/Status;)V

    .line 27
    .line 28
    .line 29
    throw p1
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public final bridge synthetic d(LA1/g;Z)V
    .locals 0

    .line 1
    iget p1, p0, LD4/G;->c:I

    return-void
.end method

.method public final f(LD4/t;)Z
    .locals 1

    .line 1
    iget v0, p0, LD4/G;->c:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p1, LD4/t;->j:Ljava/util/HashMap;

    .line 7
    .line 8
    iget-object v0, p0, LD4/G;->d:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, LD4/i;

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, LD4/C;

    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    const/4 p1, 0x1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 p1, 0x0

    .line 23
    :goto_0
    return p1

    .line 24
    :pswitch_0
    iget-object p1, p0, LD4/G;->d:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, LD4/C;

    .line 27
    .line 28
    iget-object p1, p1, LD4/C;->a:Landroid/support/v4/media/session/y;

    .line 29
    .line 30
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 31
    .line 32
    .line 33
    const/4 p1, 0x1

    .line 34
    return p1

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 36
    .line 37
    .line 38
.end method

.method public final g(LD4/t;)[LB4/d;
    .locals 1

    .line 1
    iget v0, p0, LD4/G;->c:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object p1, p1, LD4/t;->j:Ljava/util/HashMap;

    .line 7
    .line 8
    iget-object v0, p0, LD4/G;->d:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, LD4/i;

    .line 11
    .line 12
    invoke-virtual {p1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    check-cast p1, LD4/C;

    .line 17
    .line 18
    if-nez p1, :cond_0

    .line 19
    .line 20
    const/4 p1, 0x0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    iget-object p1, p1, LD4/C;->a:Landroid/support/v4/media/session/y;

    .line 23
    .line 24
    iget-object p1, p1, Landroid/support/v4/media/session/y;->c:Ljava/lang/Object;

    .line 25
    .line 26
    check-cast p1, [LB4/d;

    .line 27
    .line 28
    :goto_0
    return-object p1

    .line 29
    :pswitch_0
    iget-object p1, p0, LD4/G;->d:Ljava/lang/Object;

    .line 30
    .line 31
    check-cast p1, LD4/C;

    .line 32
    .line 33
    iget-object p1, p1, LD4/C;->a:Landroid/support/v4/media/session/y;

    .line 34
    .line 35
    iget-object p1, p1, Landroid/support/v4/media/session/y;->c:Ljava/lang/Object;

    .line 36
    .line 37
    check-cast p1, [LB4/d;

    .line 38
    .line 39
    return-object p1

    .line 40
    nop

    .line 41
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 42
    .line 43
    .line 44
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
.end method

.method public final h(LD4/t;)V
    .locals 3

    .line 1
    iget v0, p0, LD4/G;->c:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p1, LD4/t;->j:Ljava/util/HashMap;

    .line 7
    .line 8
    iget-object v1, p0, LD4/G;->d:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v1, LD4/i;

    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    .line 14
    .line 15
    move-result-object v0

    .line 16
    check-cast v0, LD4/C;

    .line 17
    .line 18
    if-eqz v0, :cond_0

    .line 19
    .line 20
    iget-object p1, p1, LD4/t;->f:LC4/c;

    .line 21
    .line 22
    iget-object v1, p0, LD4/G;->b:Lf5/i;

    .line 23
    .line 24
    iget-object v2, v0, LD4/C;->b:Lo1/f;

    .line 25
    .line 26
    iget-object v2, v2, Lo1/f;->b:Ljava/lang/Object;

    .line 27
    .line 28
    check-cast v2, LA3/F;

    .line 29
    .line 30
    iget-object v2, v2, LA3/F;->d:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v2, Le0/c;

    .line 33
    .line 34
    invoke-virtual {v2, p1, v1}, Le0/c;->H(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 35
    .line 36
    .line 37
    iget-object p1, v0, LD4/C;->a:Landroid/support/v4/media/session/y;

    .line 38
    .line 39
    iget-object p1, p1, Landroid/support/v4/media/session/y;->b:Ljava/lang/Object;

    .line 40
    .line 41
    check-cast p1, LD4/j;

    .line 42
    .line 43
    const/4 v0, 0x0

    .line 44
    iput-object v0, p1, LD4/j;->a:LD4/i;

    .line 45
    .line 46
    goto :goto_0

    .line 47
    :cond_0
    iget-object p1, p0, LD4/G;->b:Lf5/i;

    .line 48
    .line 49
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 50
    .line 51
    invoke-virtual {p1, v0}, Lf5/i;->d(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    :goto_0
    return-void

    .line 55
    :pswitch_0
    iget-object v0, p0, LD4/G;->d:Ljava/lang/Object;

    .line 56
    .line 57
    check-cast v0, LD4/C;

    .line 58
    .line 59
    iget-object v0, v0, LD4/C;->a:Landroid/support/v4/media/session/y;

    .line 60
    .line 61
    iget-object v1, p1, LD4/t;->f:LC4/c;

    .line 62
    .line 63
    iget-object v2, p0, LD4/G;->b:Lf5/i;

    .line 64
    .line 65
    iget-object v0, v0, Landroid/support/v4/media/session/y;->d:Ljava/lang/Object;

    .line 66
    .line 67
    check-cast v0, LA3/F;

    .line 68
    .line 69
    iget-object v0, v0, LA3/F;->c:Ljava/lang/Object;

    .line 70
    .line 71
    check-cast v0, Lf5/o;

    .line 72
    .line 73
    invoke-virtual {v0, v1, v2}, Lf5/o;->H(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 74
    .line 75
    .line 76
    iget-object v0, p0, LD4/G;->d:Ljava/lang/Object;

    .line 77
    .line 78
    check-cast v0, LD4/C;

    .line 79
    .line 80
    iget-object v0, v0, LD4/C;->a:Landroid/support/v4/media/session/y;

    .line 81
    .line 82
    iget-object v0, v0, Landroid/support/v4/media/session/y;->b:Ljava/lang/Object;

    .line 83
    .line 84
    check-cast v0, LD4/j;

    .line 85
    .line 86
    iget-object v0, v0, LD4/j;->a:LD4/i;

    .line 87
    .line 88
    if-eqz v0, :cond_1

    .line 89
    .line 90
    iget-object p1, p1, LD4/t;->j:Ljava/util/HashMap;

    .line 91
    .line 92
    iget-object v1, p0, LD4/G;->d:Ljava/lang/Object;

    .line 93
    .line 94
    check-cast v1, LD4/C;

    .line 95
    .line 96
    invoke-virtual {p1, v0, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    :cond_1
    return-void

    .line 100
    nop

    .line 101
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
