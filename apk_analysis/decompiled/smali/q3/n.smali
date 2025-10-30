.class public final Lq3/n;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:I

.field public final b:I

.field public final c:I

.field public final d:I

.field public final e:I

.field public final f:I

.field public final g:I

.field public final h:I

.field public final i:I

.field public final j:J

.field public final k:Lk4/E;

.field public final l:LD3/c;


# direct methods
.method public constructor <init>(IIIIIIIJLk4/E;LD3/c;)V
    .locals 0

    .line 18
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 19
    iput p1, p0, Lq3/n;->a:I

    .line 20
    iput p2, p0, Lq3/n;->b:I

    .line 21
    iput p3, p0, Lq3/n;->c:I

    .line 22
    iput p4, p0, Lq3/n;->d:I

    .line 23
    iput p5, p0, Lq3/n;->e:I

    .line 24
    invoke-static {p5}, Lq3/n;->d(I)I

    move-result p1

    iput p1, p0, Lq3/n;->f:I

    .line 25
    iput p6, p0, Lq3/n;->g:I

    .line 26
    iput p7, p0, Lq3/n;->h:I

    .line 27
    invoke-static {p7}, Lq3/n;->a(I)I

    move-result p1

    iput p1, p0, Lq3/n;->i:I

    .line 28
    iput-wide p8, p0, Lq3/n;->j:J

    .line 29
    iput-object p10, p0, Lq3/n;->k:Lk4/E;

    .line 30
    iput-object p11, p0, Lq3/n;->l:LD3/c;

    return-void
.end method

.method public constructor <init>(I[B)V
    .locals 5

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, LZ3/f;

    .line 3
    array-length v1, p2

    invoke-direct {v0, v1, p2}, LZ3/f;-><init>(I[B)V

    mul-int/lit8 p1, p1, 0x8

    .line 4
    invoke-virtual {v0, p1}, LZ3/f;->o(I)V

    const/16 p1, 0x10

    .line 5
    invoke-virtual {v0, p1}, LZ3/f;->i(I)I

    move-result p2

    iput p2, p0, Lq3/n;->a:I

    .line 6
    invoke-virtual {v0, p1}, LZ3/f;->i(I)I

    move-result p1

    iput p1, p0, Lq3/n;->b:I

    const/16 p1, 0x18

    .line 7
    invoke-virtual {v0, p1}, LZ3/f;->i(I)I

    move-result p2

    iput p2, p0, Lq3/n;->c:I

    .line 8
    invoke-virtual {v0, p1}, LZ3/f;->i(I)I

    move-result p1

    iput p1, p0, Lq3/n;->d:I

    const/16 p1, 0x14

    .line 9
    invoke-virtual {v0, p1}, LZ3/f;->i(I)I

    move-result p1

    iput p1, p0, Lq3/n;->e:I

    .line 10
    invoke-static {p1}, Lq3/n;->d(I)I

    move-result p1

    iput p1, p0, Lq3/n;->f:I

    const/4 p1, 0x3

    .line 11
    invoke-virtual {v0, p1}, LZ3/f;->i(I)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lq3/n;->g:I

    const/4 p1, 0x5

    .line 12
    invoke-virtual {v0, p1}, LZ3/f;->i(I)I

    move-result p1

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lq3/n;->h:I

    .line 13
    invoke-static {p1}, Lq3/n;->a(I)I

    move-result p1

    iput p1, p0, Lq3/n;->i:I

    const/4 p1, 0x4

    .line 14
    invoke-virtual {v0, p1}, LZ3/f;->i(I)I

    move-result p1

    const/16 p2, 0x20

    invoke-virtual {v0, p2}, LZ3/f;->i(I)I

    move-result v0

    sget v1, Ll4/y;->a:I

    int-to-long v1, p1

    const-wide v3, 0xffffffffL

    and-long/2addr v1, v3

    shl-long p1, v1, p2

    int-to-long v0, v0

    and-long/2addr v0, v3

    or-long/2addr p1, v0

    .line 15
    iput-wide p1, p0, Lq3/n;->j:J

    const/4 p1, 0x0

    .line 16
    iput-object p1, p0, Lq3/n;->k:Lk4/E;

    .line 17
    iput-object p1, p0, Lq3/n;->l:LD3/c;

    return-void
.end method

.method public static a(I)I
    .locals 1

    .line 1
    const/16 v0, 0x8

    .line 2
    .line 3
    if-eq p0, v0, :cond_4

    .line 4
    .line 5
    const/16 v0, 0xc

    .line 6
    .line 7
    if-eq p0, v0, :cond_3

    .line 8
    .line 9
    const/16 v0, 0x10

    .line 10
    .line 11
    if-eq p0, v0, :cond_2

    .line 12
    .line 13
    const/16 v0, 0x14

    .line 14
    .line 15
    if-eq p0, v0, :cond_1

    .line 16
    .line 17
    const/16 v0, 0x18

    .line 18
    .line 19
    if-eq p0, v0, :cond_0

    .line 20
    .line 21
    const/4 p0, -0x1

    .line 22
    return p0

    .line 23
    :cond_0
    const/4 p0, 0x6

    .line 24
    return p0

    .line 25
    :cond_1
    const/4 p0, 0x5

    .line 26
    return p0

    .line 27
    :cond_2
    const/4 p0, 0x4

    .line 28
    return p0

    .line 29
    :cond_3
    const/4 p0, 0x2

    .line 30
    return p0

    .line 31
    :cond_4
    const/4 p0, 0x1

    .line 32
    return p0
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method

.method public static d(I)I
    .locals 0

    .line 1
    sparse-switch p0, :sswitch_data_0

    .line 2
    .line 3
    .line 4
    const/4 p0, -0x1

    .line 5
    return p0

    .line 6
    :sswitch_0
    const/4 p0, 0x3

    .line 7
    return p0

    .line 8
    :sswitch_1
    const/4 p0, 0x2

    .line 9
    return p0

    .line 10
    :sswitch_2
    const/16 p0, 0xb

    .line 11
    .line 12
    return p0

    .line 13
    :sswitch_3
    const/4 p0, 0x1

    .line 14
    return p0

    .line 15
    :sswitch_4
    const/16 p0, 0xa

    .line 16
    .line 17
    return p0

    .line 18
    :sswitch_5
    const/16 p0, 0x9

    .line 19
    .line 20
    return p0

    .line 21
    :sswitch_6
    const/16 p0, 0x8

    .line 22
    .line 23
    return p0

    .line 24
    :sswitch_7
    const/4 p0, 0x7

    .line 25
    return p0

    .line 26
    :sswitch_8
    const/4 p0, 0x6

    .line 27
    return p0

    .line 28
    :sswitch_9
    const/4 p0, 0x5

    .line 29
    return p0

    .line 30
    :sswitch_a
    const/4 p0, 0x4

    .line 31
    return p0

    .line 32
    nop

    .line 33
    :sswitch_data_0
    .sparse-switch
        0x1f40 -> :sswitch_a
        0x3e80 -> :sswitch_9
        0x5622 -> :sswitch_8
        0x5dc0 -> :sswitch_7
        0x7d00 -> :sswitch_6
        0xac44 -> :sswitch_5
        0xbb80 -> :sswitch_4
        0x15888 -> :sswitch_3
        0x17700 -> :sswitch_2
        0x2b110 -> :sswitch_1
        0x2ee00 -> :sswitch_0
    .end sparse-switch
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method


# virtual methods
.method public final b()J
    .locals 4

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iget-wide v2, p0, Lq3/n;->j:J

    .line 4
    .line 5
    cmp-long v0, v2, v0

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    return-wide v0

    .line 15
    :cond_0
    const-wide/32 v0, 0xf4240

    .line 16
    .line 17
    .line 18
    mul-long/2addr v2, v0

    .line 19
    iget v0, p0, Lq3/n;->e:I

    .line 20
    .line 21
    int-to-long v0, v0

    .line 22
    div-long/2addr v2, v0

    .line 23
    return-wide v2
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

.method public final c([BLD3/c;)Lj3/M;
    .locals 7

    .line 1
    const/4 v0, 0x4

    .line 2
    const/16 v1, -0x80

    .line 3
    .line 4
    aput-byte v1, p1, v0

    .line 5
    .line 6
    iget v0, p0, Lq3/n;->d:I

    .line 7
    .line 8
    if-lez v0, :cond_0

    .line 9
    .line 10
    goto :goto_0

    .line 11
    :cond_0
    const/4 v0, -0x1

    .line 12
    :goto_0
    iget-object v1, p0, Lq3/n;->l:LD3/c;

    .line 13
    .line 14
    if-nez v1, :cond_1

    .line 15
    .line 16
    goto :goto_2

    .line 17
    :cond_1
    if-nez p2, :cond_2

    .line 18
    .line 19
    goto :goto_1

    .line 20
    :cond_2
    iget-object p2, p2, LD3/c;->a:[LD3/b;

    .line 21
    .line 22
    array-length v2, p2

    .line 23
    if-nez v2, :cond_3

    .line 24
    .line 25
    :goto_1
    move-object p2, v1

    .line 26
    goto :goto_2

    .line 27
    :cond_3
    new-instance v2, LD3/c;

    .line 28
    .line 29
    sget v3, Ll4/y;->a:I

    .line 30
    .line 31
    iget-object v3, v1, LD3/c;->a:[LD3/b;

    .line 32
    .line 33
    array-length v4, v3

    .line 34
    array-length v5, p2

    .line 35
    add-int/2addr v4, v5

    .line 36
    invoke-static {v3, v4}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    move-result-object v4

    .line 40
    array-length v3, v3

    .line 41
    array-length v5, p2

    .line 42
    const/4 v6, 0x0

    .line 43
    invoke-static {p2, v6, v4, v3, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 44
    .line 45
    .line 46
    check-cast v4, [LD3/b;

    .line 47
    .line 48
    iget-wide v5, v1, LD3/c;->b:J

    .line 49
    .line 50
    invoke-direct {v2, v5, v6, v4}, LD3/c;-><init>(J[LD3/b;)V

    .line 51
    .line 52
    .line 53
    move-object p2, v2

    .line 54
    :goto_2
    new-instance v1, Lj3/L;

    .line 55
    .line 56
    invoke-direct {v1}, Lj3/L;-><init>()V

    .line 57
    .line 58
    .line 59
    const-string v2, "audio/flac"

    .line 60
    .line 61
    iput-object v2, v1, Lj3/L;->k:Ljava/lang/String;

    .line 62
    .line 63
    iput v0, v1, Lj3/L;->l:I

    .line 64
    .line 65
    iget v0, p0, Lq3/n;->g:I

    .line 66
    .line 67
    iput v0, v1, Lj3/L;->x:I

    .line 68
    .line 69
    iget v0, p0, Lq3/n;->e:I

    .line 70
    .line 71
    iput v0, v1, Lj3/L;->y:I

    .line 72
    .line 73
    invoke-static {p1}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    iput-object p1, v1, Lj3/L;->m:Ljava/util/List;

    .line 78
    .line 79
    iput-object p2, v1, Lj3/L;->i:LD3/c;

    .line 80
    .line 81
    new-instance p1, Lj3/M;

    .line 82
    .line 83
    invoke-direct {p1, v1}, Lj3/M;-><init>(Lj3/L;)V

    .line 84
    .line 85
    .line 86
    return-object p1
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
