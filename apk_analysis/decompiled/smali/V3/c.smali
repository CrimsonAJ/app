.class public final LV3/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LV3/h;


# static fields
.field public static final h:[I

.field public static final i:[I


# instance fields
.field public final a:LU3/l;

.field public final b:Z

.field public final c:I

.field public d:Lq3/u;

.field public e:J

.field public f:J

.field public g:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const/16 v0, 0x10

    .line 2
    .line 3
    new-array v1, v0, [I

    .line 4
    .line 5
    fill-array-data v1, :array_0

    .line 6
    .line 7
    .line 8
    sput-object v1, LV3/c;->h:[I

    .line 9
    .line 10
    new-array v0, v0, [I

    .line 11
    .line 12
    fill-array-data v0, :array_1

    .line 13
    .line 14
    .line 15
    sput-object v0, LV3/c;->i:[I

    .line 16
    .line 17
    return-void

    .line 18
    nop

    .line 19
    :array_0
    .array-data 4
        0xd
        0xe
        0x10
        0x12
        0x14
        0x15
        0x1b
        0x20
        0x6
        0x7
        0x6
        0x6
        0x1
        0x1
        0x1
        0x1
    .end array-data

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
    :array_1
    .array-data 4
        0x12
        0x18
        0x21
        0x25
        0x29
        0x2f
        0x33
        0x3b
        0x3d
        0x6
        0x1
        0x1
        0x1
        0x1
        0x1
        0x1
    .end array-data
.end method

.method public constructor <init>(LU3/l;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LV3/c;->a:LU3/l;

    .line 5
    .line 6
    iget-object v0, p1, LU3/l;->c:Lj3/M;

    .line 7
    .line 8
    iget-object v0, v0, Lj3/M;->l:Ljava/lang/String;

    .line 9
    .line 10
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 11
    .line 12
    .line 13
    const-string v1, "audio/amr-wb"

    .line 14
    .line 15
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v0

    .line 19
    iput-boolean v0, p0, LV3/c;->b:Z

    .line 20
    .line 21
    iget p1, p1, LU3/l;->b:I

    .line 22
    .line 23
    iput p1, p0, LV3/c;->c:I

    .line 24
    .line 25
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    iput-wide v0, p0, LV3/c;->e:J

    .line 31
    .line 32
    const/4 p1, -0x1

    .line 33
    iput p1, p0, LV3/c;->g:I

    .line 34
    .line 35
    const-wide/16 v0, 0x0

    .line 36
    .line 37
    iput-wide v0, p0, LV3/c;->f:J

    .line 38
    .line 39
    return-void
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
.end method


# virtual methods
.method public final b(JJ)V
    .locals 0

    .line 1
    iput-wide p1, p0, LV3/c;->e:J

    .line 2
    .line 3
    iput-wide p3, p0, LV3/c;->f:J

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
    iput-wide p1, p0, LV3/c;->e:J

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
    .locals 10

    .line 1
    iget-object p5, p0, LV3/c;->d:Lq3/u;

    .line 2
    .line 3
    invoke-static {p5}, Ll4/a;->n(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    iget p5, p0, LV3/c;->g:I

    .line 7
    .line 8
    const/4 v0, -0x1

    .line 9
    if-eq p5, v0, :cond_0

    .line 10
    .line 11
    invoke-static {p5}, LU3/i;->a(I)I

    .line 12
    .line 13
    .line 14
    move-result p5

    .line 15
    if-eq p4, p5, :cond_0

    .line 16
    .line 17
    sget v0, Ll4/y;->a:I

    .line 18
    .line 19
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 20
    .line 21
    new-instance v0, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    const-string v1, "Received RTP packet with unexpected sequence number. Expected: "

    .line 24
    .line 25
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    const-string p5, "; received: "

    .line 32
    .line 33
    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    const-string p5, "."

    .line 40
    .line 41
    invoke-virtual {v0, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object p5

    .line 48
    const-string v0, "RtpAmrReader"

    .line 49
    .line 50
    invoke-static {v0, p5}, Ll4/a;->P(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    :cond_0
    const/4 p5, 0x1

    .line 54
    invoke-virtual {p1, p5}, LA4/r;->I(I)V

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, LA4/r;->g()I

    .line 58
    .line 59
    .line 60
    move-result v0

    .line 61
    shr-int/lit8 v0, v0, 0x3

    .line 62
    .line 63
    const/16 v1, 0xf

    .line 64
    .line 65
    and-int/2addr v0, v1

    .line 66
    const/4 v2, 0x0

    .line 67
    if-ltz v0, :cond_1

    .line 68
    .line 69
    const/16 v3, 0x8

    .line 70
    .line 71
    if-le v0, v3, :cond_2

    .line 72
    .line 73
    :cond_1
    if-ne v0, v1, :cond_3

    .line 74
    .line 75
    :cond_2
    move v1, p5

    .line 76
    goto :goto_0

    .line 77
    :cond_3
    move v1, v2

    .line 78
    :goto_0
    new-instance v3, Ljava/lang/StringBuilder;

    .line 79
    .line 80
    const-string v4, "Illegal AMR "

    .line 81
    .line 82
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 83
    .line 84
    .line 85
    iget-boolean v4, p0, LV3/c;->b:Z

    .line 86
    .line 87
    if-eqz v4, :cond_4

    .line 88
    .line 89
    const-string v5, "WB"

    .line 90
    .line 91
    goto :goto_1

    .line 92
    :cond_4
    const-string v5, "NB"

    .line 93
    .line 94
    :goto_1
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    const-string v5, " frame type "

    .line 98
    .line 99
    invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 103
    .line 104
    .line 105
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 106
    .line 107
    .line 108
    move-result-object v3

    .line 109
    invoke-static {v3, v1}, Ll4/a;->g(Ljava/lang/String;Z)V

    .line 110
    .line 111
    .line 112
    if-eqz v4, :cond_5

    .line 113
    .line 114
    sget-object v1, LV3/c;->i:[I

    .line 115
    .line 116
    aget v0, v1, v0

    .line 117
    .line 118
    goto :goto_2

    .line 119
    :cond_5
    sget-object v1, LV3/c;->h:[I

    .line 120
    .line 121
    aget v0, v1, v0

    .line 122
    .line 123
    :goto_2
    invoke-virtual {p1}, LA4/r;->e()I

    .line 124
    .line 125
    .line 126
    move-result v7

    .line 127
    if-ne v7, v0, :cond_6

    .line 128
    .line 129
    goto :goto_3

    .line 130
    :cond_6
    move p5, v2

    .line 131
    :goto_3
    const-string v0, "compound payload not supported currently"

    .line 132
    .line 133
    invoke-static {v0, p5}, Ll4/a;->g(Ljava/lang/String;Z)V

    .line 134
    .line 135
    .line 136
    iget-object p5, p0, LV3/c;->d:Lq3/u;

    .line 137
    .line 138
    invoke-interface {p5, v7, p1}, Lq3/u;->c(ILA4/r;)V

    .line 139
    .line 140
    .line 141
    iget-wide v0, p0, LV3/c;->f:J

    .line 142
    .line 143
    iget-wide v4, p0, LV3/c;->e:J

    .line 144
    .line 145
    iget v6, p0, LV3/c;->c:I

    .line 146
    .line 147
    move-wide v2, p2

    .line 148
    invoke-static/range {v0 .. v6}, Ll6/b;->w(JJJI)J

    .line 149
    .line 150
    .line 151
    move-result-wide v4

    .line 152
    iget-object v3, p0, LV3/c;->d:Lq3/u;

    .line 153
    .line 154
    const/4 v9, 0x0

    .line 155
    const/4 v6, 0x1

    .line 156
    const/4 v8, 0x0

    .line 157
    invoke-interface/range {v3 .. v9}, Lq3/u;->d(JIIILq3/t;)V

    .line 158
    .line 159
    .line 160
    iput p4, p0, LV3/c;->g:I

    .line 161
    .line 162
    return-void
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
    iput-object p1, p0, LV3/c;->d:Lq3/u;

    .line 7
    .line 8
    iget-object p2, p0, LV3/c;->a:LU3/l;

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
