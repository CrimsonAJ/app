.class public final LV3/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV3/h;


# instance fields
.field public final a:LU3/l;

.field public b:Lq3/u;

.field public c:J

.field public d:J

.field public e:I

.field public f:Z

.field public g:Z


# direct methods
.method public constructor <init>(LU3/l;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LV3/g;->a:LU3/l;

    .line 5
    .line 6
    const-wide/16 v0, -0x1

    .line 7
    .line 8
    iput-wide v0, p0, LV3/g;->c:J

    .line 9
    .line 10
    const/4 p1, -0x1

    .line 11
    iput p1, p0, LV3/g;->e:I

    .line 12
    .line 13
    return-void
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


# virtual methods
.method public final b(JJ)V
    .locals 0

    .line 1
    iput-wide p1, p0, LV3/g;->c:J

    .line 2
    .line 3
    iput-wide p3, p0, LV3/g;->d:J

    .line 4
    .line 5
    return-void
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

.method public final c(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, LV3/g;->c:J

    .line 2
    .line 3
    return-void
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
.end method

.method public final d(LA4/r;JIZ)V
    .locals 17

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    move/from16 v2, p4

    .line 6
    .line 7
    iget-object v3, v0, LV3/g;->b:Lq3/u;

    .line 8
    .line 9
    invoke-static {v3}, Ll4/a;->n(Ljava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    iget-boolean v3, v0, LV3/g;->f:Z

    .line 13
    .line 14
    const/4 v4, 0x0

    .line 15
    const/16 v5, 0x8

    .line 16
    .line 17
    const/4 v6, 0x1

    .line 18
    if-nez v3, :cond_2

    .line 19
    .line 20
    iget v3, v1, LA4/r;->a:I

    .line 21
    .line 22
    iget v7, v1, LA4/r;->b:I

    .line 23
    .line 24
    const/16 v8, 0x12

    .line 25
    .line 26
    if-le v7, v8, :cond_0

    .line 27
    .line 28
    move v7, v6

    .line 29
    goto :goto_0

    .line 30
    :cond_0
    move v7, v4

    .line 31
    :goto_0
    const-string v8, "ID Header has insufficient data"

    .line 32
    .line 33
    invoke-static {v8, v7}, Ll4/a;->g(Ljava/lang/String;Z)V

    .line 34
    .line 35
    .line 36
    sget-object v7, LO5/e;->c:Ljava/nio/charset/Charset;

    .line 37
    .line 38
    invoke-virtual {v1, v5, v7}, LA4/r;->v(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    const-string v7, "OpusHead"

    .line 43
    .line 44
    invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    move-result v5

    .line 48
    const-string v7, "ID Header missing"

    .line 49
    .line 50
    invoke-static {v7, v5}, Ll4/a;->g(Ljava/lang/String;Z)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, LA4/r;->x()I

    .line 54
    .line 55
    .line 56
    move-result v5

    .line 57
    if-ne v5, v6, :cond_1

    .line 58
    .line 59
    move v4, v6

    .line 60
    :cond_1
    const-string v5, "version number must always be 1"

    .line 61
    .line 62
    invoke-static {v5, v4}, Ll4/a;->g(Ljava/lang/String;Z)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v3}, LA4/r;->H(I)V

    .line 66
    .line 67
    .line 68
    iget-object v1, v1, LA4/r;->c:Ljava/lang/Object;

    .line 69
    .line 70
    check-cast v1, [B

    .line 71
    .line 72
    invoke-static {v1}, Ll3/a;->c([B)Ljava/util/ArrayList;

    .line 73
    .line 74
    .line 75
    move-result-object v1

    .line 76
    iget-object v3, v0, LV3/g;->a:LU3/l;

    .line 77
    .line 78
    iget-object v3, v3, LU3/l;->c:Lj3/M;

    .line 79
    .line 80
    invoke-virtual {v3}, Lj3/M;->a()Lj3/L;

    .line 81
    .line 82
    .line 83
    move-result-object v3

    .line 84
    iput-object v1, v3, Lj3/L;->m:Ljava/util/List;

    .line 85
    .line 86
    iget-object v1, v0, LV3/g;->b:Lq3/u;

    .line 87
    .line 88
    invoke-static {v3, v1}, Lcom/google/android/gms/internal/measurement/k1;->u(Lj3/L;Lq3/u;)V

    .line 89
    .line 90
    .line 91
    iput-boolean v6, v0, LV3/g;->f:Z

    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_2
    iget-boolean v3, v0, LV3/g;->g:Z

    .line 95
    .line 96
    if-nez v3, :cond_4

    .line 97
    .line 98
    iget v3, v1, LA4/r;->b:I

    .line 99
    .line 100
    if-lt v3, v5, :cond_3

    .line 101
    .line 102
    move v4, v6

    .line 103
    :cond_3
    const-string v3, "Comment Header has insufficient data"

    .line 104
    .line 105
    invoke-static {v3, v4}, Ll4/a;->g(Ljava/lang/String;Z)V

    .line 106
    .line 107
    .line 108
    sget-object v3, LO5/e;->c:Ljava/nio/charset/Charset;

    .line 109
    .line 110
    invoke-virtual {v1, v5, v3}, LA4/r;->v(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 111
    .line 112
    .line 113
    move-result-object v1

    .line 114
    const-string v3, "OpusTags"

    .line 115
    .line 116
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 117
    .line 118
    .line 119
    move-result v1

    .line 120
    const-string v3, "Comment Header should follow ID Header"

    .line 121
    .line 122
    invoke-static {v3, v1}, Ll4/a;->g(Ljava/lang/String;Z)V

    .line 123
    .line 124
    .line 125
    iput-boolean v6, v0, LV3/g;->g:Z

    .line 126
    .line 127
    goto :goto_1

    .line 128
    :cond_4
    iget v3, v0, LV3/g;->e:I

    .line 129
    .line 130
    invoke-static {v3}, LU3/i;->a(I)I

    .line 131
    .line 132
    .line 133
    move-result v3

    .line 134
    if-eq v2, v3, :cond_5

    .line 135
    .line 136
    sget v4, Ll4/y;->a:I

    .line 137
    .line 138
    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 139
    .line 140
    new-instance v4, Ljava/lang/StringBuilder;

    .line 141
    .line 142
    const-string v5, "Received RTP packet with unexpected sequence number. Expected: "

    .line 143
    .line 144
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 145
    .line 146
    .line 147
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 148
    .line 149
    .line 150
    const-string v3, "; received: "

    .line 151
    .line 152
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 156
    .line 157
    .line 158
    const-string v3, "."

    .line 159
    .line 160
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 161
    .line 162
    .line 163
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    move-result-object v3

    .line 167
    const-string v4, "RtpOpusReader"

    .line 168
    .line 169
    invoke-static {v4, v3}, Ll4/a;->P(Ljava/lang/String;Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    :cond_5
    invoke-virtual {v1}, LA4/r;->e()I

    .line 173
    .line 174
    .line 175
    move-result v9

    .line 176
    iget-object v3, v0, LV3/g;->b:Lq3/u;

    .line 177
    .line 178
    invoke-interface {v3, v9, v1}, Lq3/u;->c(ILA4/r;)V

    .line 179
    .line 180
    .line 181
    iget-wide v10, v0, LV3/g;->d:J

    .line 182
    .line 183
    iget-wide v14, v0, LV3/g;->c:J

    .line 184
    .line 185
    const v16, 0xbb80

    .line 186
    .line 187
    .line 188
    move-wide/from16 v12, p2

    .line 189
    .line 190
    invoke-static/range {v10 .. v16}, Ll6/b;->w(JJJI)J

    .line 191
    .line 192
    .line 193
    move-result-wide v6

    .line 194
    iget-object v5, v0, LV3/g;->b:Lq3/u;

    .line 195
    .line 196
    const/4 v11, 0x0

    .line 197
    const/4 v8, 0x1

    .line 198
    const/4 v10, 0x0

    .line 199
    invoke-interface/range {v5 .. v11}, Lq3/u;->d(JIIILq3/t;)V

    .line 200
    .line 201
    .line 202
    :goto_1
    iput v2, v0, LV3/g;->e:I

    .line 203
    .line 204
    return-void
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
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
.end method

.method public final e(Lq3/l;I)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    invoke-interface {p1, p2, v0}, Lq3/l;->u(II)Lq3/u;

    .line 3
    .line 4
    .line 5
    move-result-object p1

    .line 6
    iput-object p1, p0, LV3/g;->b:Lq3/u;

    .line 7
    .line 8
    iget-object p2, p0, LV3/g;->a:LU3/l;

    .line 9
    .line 10
    iget-object p2, p2, LU3/l;->c:Lj3/M;

    .line 11
    .line 12
    invoke-interface {p1, p2}, Lq3/u;->e(Lj3/M;)V

    .line 13
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
