.class public final LA1/f;
.super LF0/z0;
.source "SourceFile"


# instance fields
.field public final synthetic h:I

.field public final synthetic i:Ljava/lang/Object;


# direct methods
.method public constructor <init>(ILA1/g;)V
    .locals 1

    const/4 v0, 0x0

    iput v0, p0, LA1/f;->h:I

    iput-object p2, p0, LA1/f;->i:Ljava/lang/Object;

    .line 2
    invoke-direct {p0, p1}, LF0/z0;-><init>(I)V

    return-void
.end method

.method public constructor <init>(Lb5/i0;)V
    .locals 1

    const/4 v0, 0x1

    iput v0, p0, LA1/f;->h:I

    .line 1
    iput-object p1, p0, LA1/f;->i:Ljava/lang/Object;

    const/16 p1, 0x14

    invoke-direct {p0, p1}, LF0/z0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public c(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, LA1/f;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, LF0/z0;->c(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    .line 8
    .line 9
    move-result-object p1

    .line 10
    return-object p1

    .line 11
    :pswitch_0
    check-cast p1, Ljava/lang/String;

    .line 12
    .line 13
    invoke-static {p1}, LF4/y;->e(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    iget-object v0, p0, LA1/f;->i:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Lb5/i0;

    .line 19
    .line 20
    iget-object v1, v0, LD/n;->a:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v1, Lb5/n0;

    .line 23
    .line 24
    iget-object v1, v1, Lb5/n0;->g:Lb5/g;

    .line 25
    .line 26
    sget-object v2, Lb5/E;->o1:Lb5/D;

    .line 27
    .line 28
    const/4 v3, 0x0

    .line 29
    invoke-virtual {v1, v3, v2}, Lb5/g;->y0(Ljava/lang/String;Lb5/D;)Z

    .line 30
    .line 31
    .line 32
    move-result v1

    .line 33
    iget-object v2, v0, Lb5/i0;->j:LA1/f;

    .line 34
    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    invoke-virtual {v0}, Lb5/D1;->m0()V

    .line 38
    .line 39
    .line 40
    invoke-static {p1}, LF4/y;->e(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    iget-object v1, v0, Lb5/z1;->b:Lb5/J1;

    .line 44
    .line 45
    iget-object v1, v1, Lb5/J1;->c:Lb5/n;

    .line 46
    .line 47
    invoke-static {v1}, Lb5/J1;->J(Lb5/D1;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, p1}, Lb5/n;->k1(Ljava/lang/String;)Landroid/support/v4/media/session/y;

    .line 51
    .line 52
    .line 53
    move-result-object v1

    .line 54
    if-nez v1, :cond_0

    .line 55
    .line 56
    goto :goto_1

    .line 57
    :cond_0
    iget-object v3, v0, LD/n;->a:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v3, Lb5/n0;

    .line 60
    .line 61
    iget-object v3, v3, Lb5/n0;->i:Lb5/V;

    .line 62
    .line 63
    invoke-static {v3}, Lb5/n0;->f(Lb5/x0;)V

    .line 64
    .line 65
    .line 66
    const-string v4, "Populate EES config from database on cache miss. appId"

    .line 67
    .line 68
    iget-object v3, v3, Lb5/V;->n:Lb5/T;

    .line 69
    .line 70
    invoke-virtual {v3, p1, v4}, Lb5/T;->c(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    iget-object v1, v1, Landroid/support/v4/media/session/y;->b:Ljava/lang/Object;

    .line 74
    .line 75
    check-cast v1, [B

    .line 76
    .line 77
    invoke-virtual {v0, p1, v1}, Lb5/i0;->r0(Ljava/lang/String;[B)Lcom/google/android/gms/internal/measurement/F0;

    .line 78
    .line 79
    .line 80
    move-result-object v1

    .line 81
    invoke-virtual {v0, p1, v1}, Lb5/i0;->u0(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/F0;)V

    .line 82
    .line 83
    .line 84
    invoke-virtual {v2}, LF0/z0;->p()Ljava/util/LinkedHashMap;

    .line 85
    .line 86
    .line 87
    move-result-object v0

    .line 88
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    move-object v3, p1

    .line 93
    check-cast v3, Lcom/google/android/gms/internal/measurement/D;

    .line 94
    .line 95
    goto :goto_1

    .line 96
    :cond_1
    invoke-virtual {v0}, Lb5/D1;->m0()V

    .line 97
    .line 98
    .line 99
    invoke-static {p1}, LF4/y;->e(Ljava/lang/String;)V

    .line 100
    .line 101
    .line 102
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 103
    .line 104
    .line 105
    move-result v1

    .line 106
    if-eqz v1, :cond_2

    .line 107
    .line 108
    goto :goto_1

    .line 109
    :cond_2
    iget-object v1, v0, Lb5/i0;->h:Ls/e;

    .line 110
    .line 111
    invoke-virtual {v1, p1}, Ls/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 112
    .line 113
    .line 114
    move-result-object v4

    .line 115
    check-cast v4, Lcom/google/android/gms/internal/measurement/F0;

    .line 116
    .line 117
    if-nez v4, :cond_3

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_3
    invoke-virtual {v4}, Lcom/google/android/gms/internal/measurement/F0;->n()I

    .line 121
    .line 122
    .line 123
    move-result v4

    .line 124
    if-eqz v4, :cond_5

    .line 125
    .line 126
    invoke-virtual {v1, p1}, Ls/i;->containsKey(Ljava/lang/Object;)Z

    .line 127
    .line 128
    .line 129
    move-result v3

    .line 130
    if-eqz v3, :cond_4

    .line 131
    .line 132
    invoke-virtual {v1, p1}, Ls/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    if-eqz v3, :cond_4

    .line 137
    .line 138
    invoke-virtual {v1, p1}, Ls/i;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    check-cast v1, Lcom/google/android/gms/internal/measurement/F0;

    .line 143
    .line 144
    invoke-virtual {v0, p1, v1}, Lb5/i0;->u0(Ljava/lang/String;Lcom/google/android/gms/internal/measurement/F0;)V

    .line 145
    .line 146
    .line 147
    goto :goto_0

    .line 148
    :cond_4
    invoke-virtual {v0, p1}, Lb5/i0;->t0(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    :goto_0
    invoke-virtual {v2}, LF0/z0;->p()Ljava/util/LinkedHashMap;

    .line 152
    .line 153
    .line 154
    move-result-object v0

    .line 155
    invoke-virtual {v0, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    .line 157
    .line 158
    move-result-object p1

    .line 159
    move-object v3, p1

    .line 160
    check-cast v3, Lcom/google/android/gms/internal/measurement/D;

    .line 161
    .line 162
    :cond_5
    :goto_1
    return-object v3

    .line 163
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_0
    .end packed-switch
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

.method public d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V
    .locals 2

    .line 1
    iget v0, p0, LA1/f;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2, p3}, LF0/z0;->d(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    .line 7
    .line 8
    .line 9
    return-void

    .line 10
    :pswitch_0
    check-cast p1, LA1/b;

    .line 11
    .line 12
    check-cast p2, LA1/e;

    .line 13
    .line 14
    check-cast p3, LA1/e;

    .line 15
    .line 16
    iget-object p3, p0, LA1/f;->i:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast p3, LA1/g;

    .line 19
    .line 20
    iget-object p3, p3, LA1/g;->b:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast p3, LA1/i;

    .line 23
    .line 24
    iget-object v0, p2, LA1/e;->a:Landroid/graphics/Bitmap;

    .line 25
    .line 26
    iget-object v1, p2, LA1/e;->b:Ljava/util/Map;

    .line 27
    .line 28
    iget p2, p2, LA1/e;->c:I

    .line 29
    .line 30
    invoke-virtual {p3, p1, v0, v1, p2}, LA1/i;->l(LA1/b;Landroid/graphics/Bitmap;Ljava/util/Map;I)V

    .line 31
    .line 32
    .line 33
    return-void

    .line 34
    nop

    .line 35
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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

.method public o(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 1

    .line 1
    iget v0, p0, LA1/f;->h:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, LF0/z0;->o(Ljava/lang/Object;Ljava/lang/Object;)I

    .line 7
    .line 8
    .line 9
    move-result p1

    .line 10
    return p1

    .line 11
    :pswitch_0
    check-cast p1, LA1/b;

    .line 12
    .line 13
    check-cast p2, LA1/e;

    .line 14
    .line 15
    iget p1, p2, LA1/e;->c:I

    .line 16
    .line 17
    return p1

    .line 18
    nop

    .line 19
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
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
