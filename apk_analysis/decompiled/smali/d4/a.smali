.class public final Ld4/a;
.super LY3/f;
.source "SourceFile"


# static fields
.field public static final r:Ljava/util/regex/Pattern;


# instance fields
.field public final m:Z

.field public final n:LF0/A0;

.field public o:Ljava/util/LinkedHashMap;

.field public p:F

.field public q:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)"

    .line 2
    .line 3
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Ld4/a;->r:Ljava/util/regex/Pattern;

    .line 8
    .line 9
    return-void
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
.end method

.method public constructor <init>(Ljava/util/List;)V
    .locals 3

    .line 1
    invoke-direct {p0}, LY3/f;-><init>()V

    .line 2
    .line 3
    .line 4
    const v0, -0x800001

    .line 5
    .line 6
    .line 7
    iput v0, p0, Ld4/a;->p:F

    .line 8
    .line 9
    iput v0, p0, Ld4/a;->q:F

    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    if-eqz p1, :cond_0

    .line 13
    .line 14
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    .line 15
    .line 16
    .line 17
    move-result v1

    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    const/4 v1, 0x1

    .line 21
    iput-boolean v1, p0, Ld4/a;->m:Z

    .line 22
    .line 23
    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, [B

    .line 28
    .line 29
    invoke-static {v0}, Ll4/y;->m([B)Ljava/lang/String;

    .line 30
    .line 31
    .line 32
    move-result-object v0

    .line 33
    const-string v2, "Format:"

    .line 34
    .line 35
    invoke-virtual {v0, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 36
    .line 37
    .line 38
    move-result v2

    .line 39
    invoke-static {v2}, Ll4/a;->h(Z)V

    .line 40
    .line 41
    .line 42
    invoke-static {v0}, LF0/A0;->b(Ljava/lang/String;)LF0/A0;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    iput-object v0, p0, Ld4/a;->n:LF0/A0;

    .line 50
    .line 51
    new-instance v0, LA4/r;

    .line 52
    .line 53
    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 54
    .line 55
    .line 56
    move-result-object p1

    .line 57
    check-cast p1, [B

    .line 58
    .line 59
    invoke-direct {v0, p1}, LA4/r;-><init>([B)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, v0}, Ld4/a;->j(LA4/r;)V

    .line 63
    .line 64
    .line 65
    return-void

    .line 66
    :cond_0
    iput-boolean v0, p0, Ld4/a;->m:Z

    .line 67
    .line 68
    const/4 p1, 0x0

    .line 69
    iput-object p1, p0, Ld4/a;->n:LF0/A0;

    .line 70
    .line 71
    return-void
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

.method public static i(JLjava/util/ArrayList;Ljava/util/ArrayList;)I
    .locals 3

    .line 1
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    add-int/lit8 v0, v0, -0x1

    .line 6
    .line 7
    :goto_0
    if-ltz v0, :cond_2

    .line 8
    .line 9
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    check-cast v1, Ljava/lang/Long;

    .line 14
    .line 15
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 16
    .line 17
    .line 18
    move-result-wide v1

    .line 19
    cmp-long v1, v1, p0

    .line 20
    .line 21
    if-nez v1, :cond_0

    .line 22
    .line 23
    return v0

    .line 24
    :cond_0
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Ljava/lang/Long;

    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    .line 31
    .line 32
    .line 33
    move-result-wide v1

    .line 34
    cmp-long v1, v1, p0

    .line 35
    .line 36
    if-gez v1, :cond_1

    .line 37
    .line 38
    add-int/lit8 v0, v0, 0x1

    .line 39
    .line 40
    goto :goto_1

    .line 41
    :cond_1
    add-int/lit8 v0, v0, -0x1

    .line 42
    .line 43
    goto :goto_0

    .line 44
    :cond_2
    const/4 v0, 0x0

    .line 45
    :goto_1
    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    invoke-virtual {p2, v0, p0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 50
    .line 51
    .line 52
    new-instance p0, Ljava/util/ArrayList;

    .line 53
    .line 54
    if-nez v0, :cond_3

    .line 55
    .line 56
    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 57
    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_3
    add-int/lit8 p1, v0, -0x1

    .line 61
    .line 62
    invoke-virtual {p3, p1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p1

    .line 66
    check-cast p1, Ljava/util/Collection;

    .line 67
    .line 68
    invoke-direct {p0, p1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 69
    .line 70
    .line 71
    :goto_2
    invoke-virtual {p3, v0, p0}, Ljava/util/ArrayList;->add(ILjava/lang/Object;)V

    .line 72
    .line 73
    .line 74
    return v0
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

.method public static k(Ljava/lang/String;)J
    .locals 6

    .line 1
    sget-object v0, Ld4/a;->r:Ljava/util/regex/Pattern;

    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-virtual {p0}, Ljava/util/regex/Matcher;->matches()Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    return-wide v0

    .line 23
    :cond_0
    const/4 v0, 0x1

    .line 24
    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v0

    .line 28
    sget v1, Ll4/y;->a:I

    .line 29
    .line 30
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 31
    .line 32
    .line 33
    move-result-wide v0

    .line 34
    const-wide v2, 0xd693a400L

    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    mul-long/2addr v0, v2

    .line 40
    const/4 v2, 0x2

    .line 41
    invoke-virtual {p0, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 42
    .line 43
    .line 44
    move-result-object v2

    .line 45
    invoke-static {v2}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 46
    .line 47
    .line 48
    move-result-wide v2

    .line 49
    const-wide/32 v4, 0x3938700

    .line 50
    .line 51
    .line 52
    mul-long/2addr v2, v4

    .line 53
    add-long/2addr v2, v0

    .line 54
    const/4 v0, 0x3

    .line 55
    invoke-virtual {p0, v0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object v0

    .line 59
    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 60
    .line 61
    .line 62
    move-result-wide v0

    .line 63
    const-wide/32 v4, 0xf4240

    .line 64
    .line 65
    .line 66
    mul-long/2addr v0, v4

    .line 67
    add-long/2addr v0, v2

    .line 68
    const/4 v2, 0x4

    .line 69
    invoke-virtual {p0, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 70
    .line 71
    .line 72
    move-result-object p0

    .line 73
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 74
    .line 75
    .line 76
    move-result-wide v2

    .line 77
    const-wide/16 v4, 0x2710

    .line 78
    .line 79
    mul-long/2addr v2, v4

    .line 80
    add-long/2addr v2, v0

    .line 81
    return-wide v2
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
.method public final f(IZ[B)LY3/g;
    .locals 36

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    new-instance v1, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    new-instance v2, Ljava/util/ArrayList;

    .line 9
    .line 10
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    new-instance v3, LA4/r;

    .line 14
    .line 15
    move/from16 v4, p1

    .line 16
    .line 17
    move-object/from16 v5, p3

    .line 18
    .line 19
    invoke-direct {v3, v4, v5}, LA4/r;-><init>(I[B)V

    .line 20
    .line 21
    .line 22
    iget-boolean v4, v0, Ld4/a;->m:Z

    .line 23
    .line 24
    if-nez v4, :cond_0

    .line 25
    .line 26
    invoke-virtual {v0, v3}, Ld4/a;->j(LA4/r;)V

    .line 27
    .line 28
    .line 29
    :cond_0
    if-eqz v4, :cond_1

    .line 30
    .line 31
    iget-object v4, v0, Ld4/a;->n:LF0/A0;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_1
    const/4 v4, 0x0

    .line 35
    :goto_0
    invoke-virtual {v3}, LA4/r;->j()Ljava/lang/String;

    .line 36
    .line 37
    .line 38
    move-result-object v6

    .line 39
    if-eqz v6, :cond_20

    .line 40
    .line 41
    const-string v7, "Format:"

    .line 42
    .line 43
    invoke-virtual {v6, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 44
    .line 45
    .line 46
    move-result v7

    .line 47
    if-eqz v7, :cond_2

    .line 48
    .line 49
    invoke-static {v6}, LF0/A0;->b(Ljava/lang/String;)LF0/A0;

    .line 50
    .line 51
    .line 52
    move-result-object v4

    .line 53
    goto :goto_0

    .line 54
    :cond_2
    const-string v7, "Dialogue:"

    .line 55
    .line 56
    invoke-virtual {v6, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 57
    .line 58
    .line 59
    move-result v8

    .line 60
    if-eqz v8, :cond_3

    .line 61
    .line 62
    const-string v8, "SsaDecoder"

    .line 63
    .line 64
    if-nez v4, :cond_4

    .line 65
    .line 66
    const-string v7, "Skipping dialogue line before complete format: "

    .line 67
    .line 68
    invoke-virtual {v7, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    move-result-object v6

    .line 72
    invoke-static {v8, v6}, Ll4/a;->P(Ljava/lang/String;Ljava/lang/String;)V

    .line 73
    .line 74
    .line 75
    :cond_3
    :goto_1
    move-object/from16 v16, v3

    .line 76
    .line 77
    move-object/from16 v35, v4

    .line 78
    .line 79
    goto/16 :goto_14

    .line 80
    .line 81
    :cond_4
    invoke-virtual {v6, v7}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 82
    .line 83
    .line 84
    move-result v7

    .line 85
    invoke-static {v7}, Ll4/a;->h(Z)V

    .line 86
    .line 87
    .line 88
    const/16 v7, 0x9

    .line 89
    .line 90
    invoke-virtual {v6, v7}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 91
    .line 92
    .line 93
    move-result-object v7

    .line 94
    const-string v9, ","

    .line 95
    .line 96
    iget v10, v4, LF0/A0;->e:I

    .line 97
    .line 98
    invoke-virtual {v7, v9, v10}, Ljava/lang/String;->split(Ljava/lang/String;I)[Ljava/lang/String;

    .line 99
    .line 100
    .line 101
    move-result-object v7

    .line 102
    array-length v9, v7

    .line 103
    if-eq v9, v10, :cond_5

    .line 104
    .line 105
    const-string v7, "Skipping dialogue line with fewer columns than format: "

    .line 106
    .line 107
    invoke-virtual {v7, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 108
    .line 109
    .line 110
    move-result-object v6

    .line 111
    invoke-static {v8, v6}, Ll4/a;->P(Ljava/lang/String;Ljava/lang/String;)V

    .line 112
    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_5
    iget v9, v4, LF0/A0;->a:I

    .line 116
    .line 117
    aget-object v9, v7, v9

    .line 118
    .line 119
    invoke-static {v9}, Ld4/a;->k(Ljava/lang/String;)J

    .line 120
    .line 121
    .line 122
    move-result-wide v9

    .line 123
    const-wide v11, -0x7fffffffffffffffL    # -4.9E-324

    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    cmp-long v13, v9, v11

    .line 129
    .line 130
    const-string v14, "Skipping invalid timing: "

    .line 131
    .line 132
    if-nez v13, :cond_6

    .line 133
    .line 134
    invoke-virtual {v14, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 135
    .line 136
    .line 137
    move-result-object v6

    .line 138
    invoke-static {v8, v6}, Ll4/a;->P(Ljava/lang/String;Ljava/lang/String;)V

    .line 139
    .line 140
    .line 141
    goto :goto_1

    .line 142
    :cond_6
    iget v13, v4, LF0/A0;->b:I

    .line 143
    .line 144
    aget-object v13, v7, v13

    .line 145
    .line 146
    move-wide/from16 p1, v11

    .line 147
    .line 148
    invoke-static {v13}, Ld4/a;->k(Ljava/lang/String;)J

    .line 149
    .line 150
    .line 151
    move-result-wide v11

    .line 152
    cmp-long v13, v11, p1

    .line 153
    .line 154
    if-nez v13, :cond_7

    .line 155
    .line 156
    invoke-virtual {v14, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 157
    .line 158
    .line 159
    move-result-object v6

    .line 160
    invoke-static {v8, v6}, Ll4/a;->P(Ljava/lang/String;Ljava/lang/String;)V

    .line 161
    .line 162
    .line 163
    goto :goto_1

    .line 164
    :cond_7
    iget-object v6, v0, Ld4/a;->o:Ljava/util/LinkedHashMap;

    .line 165
    .line 166
    const/4 v13, -0x1

    .line 167
    if-eqz v6, :cond_8

    .line 168
    .line 169
    iget v14, v4, LF0/A0;->c:I

    .line 170
    .line 171
    if-eq v14, v13, :cond_8

    .line 172
    .line 173
    aget-object v14, v7, v14

    .line 174
    .line 175
    invoke-virtual {v14}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 176
    .line 177
    .line 178
    move-result-object v14

    .line 179
    invoke-virtual {v6, v14}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 180
    .line 181
    .line 182
    move-result-object v6

    .line 183
    check-cast v6, Ld4/d;

    .line 184
    .line 185
    goto :goto_2

    .line 186
    :cond_8
    const/4 v6, 0x0

    .line 187
    :goto_2
    iget v14, v4, LF0/A0;->d:I

    .line 188
    .line 189
    aget-object v7, v7, v14

    .line 190
    .line 191
    sget-object v14, Ld4/c;->a:Ljava/util/regex/Pattern;

    .line 192
    .line 193
    invoke-virtual {v14, v7}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 194
    .line 195
    .line 196
    move-result-object v14

    .line 197
    move v15, v13

    .line 198
    const/4 v5, 0x0

    .line 199
    :goto_3
    invoke-virtual {v14}, Ljava/util/regex/Matcher;->find()Z

    .line 200
    .line 201
    .line 202
    move-result v16

    .line 203
    const/4 v13, 0x1

    .line 204
    if-eqz v16, :cond_c

    .line 205
    .line 206
    move-object/from16 v16, v3

    .line 207
    .line 208
    invoke-virtual {v14, v13}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 209
    .line 210
    .line 211
    move-result-object v3

    .line 212
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 213
    .line 214
    .line 215
    :try_start_0
    invoke-static {v3}, Ld4/c;->a(Ljava/lang/String;)Landroid/graphics/PointF;

    .line 216
    .line 217
    .line 218
    move-result-object v17
    :try_end_0
    .catch Ljava/lang/RuntimeException; {:try_start_0 .. :try_end_0} :catch_0

    .line 219
    if-eqz v17, :cond_9

    .line 220
    .line 221
    move-object/from16 v5, v17

    .line 222
    .line 223
    :catch_0
    :cond_9
    :try_start_1
    sget-object v13, Ld4/c;->d:Ljava/util/regex/Pattern;

    .line 224
    .line 225
    invoke-virtual {v13, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 226
    .line 227
    .line 228
    move-result-object v3

    .line 229
    invoke-virtual {v3}, Ljava/util/regex/Matcher;->find()Z

    .line 230
    .line 231
    .line 232
    move-result v13

    .line 233
    if-eqz v13, :cond_a

    .line 234
    .line 235
    const/4 v13, 0x1

    .line 236
    invoke-virtual {v3, v13}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v3

    .line 240
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 241
    .line 242
    .line 243
    invoke-static {v3}, Ld4/d;->a(Ljava/lang/String;)I

    .line 244
    .line 245
    .line 246
    move-result v3
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    .line 247
    :goto_4
    const/4 v13, -0x1

    .line 248
    goto :goto_5

    .line 249
    :cond_a
    const/4 v3, -0x1

    .line 250
    goto :goto_4

    .line 251
    :goto_5
    if-eq v3, v13, :cond_b

    .line 252
    .line 253
    move v15, v3

    .line 254
    :catch_1
    :cond_b
    move-object/from16 v3, v16

    .line 255
    .line 256
    const/4 v13, -0x1

    .line 257
    goto :goto_3

    .line 258
    :cond_c
    move-object/from16 v16, v3

    .line 259
    .line 260
    new-instance v3, Ld4/c;

    .line 261
    .line 262
    sget-object v3, Ld4/c;->a:Ljava/util/regex/Pattern;

    .line 263
    .line 264
    invoke-virtual {v3, v7}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 265
    .line 266
    .line 267
    move-result-object v3

    .line 268
    const-string v7, ""

    .line 269
    .line 270
    invoke-virtual {v3, v7}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    .line 271
    .line 272
    .line 273
    move-result-object v3

    .line 274
    const-string v7, "\\N"

    .line 275
    .line 276
    const-string v13, "\n"

    .line 277
    .line 278
    invoke-virtual {v3, v7, v13}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 279
    .line 280
    .line 281
    move-result-object v3

    .line 282
    const-string v7, "\\n"

    .line 283
    .line 284
    invoke-virtual {v3, v7, v13}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 285
    .line 286
    .line 287
    move-result-object v3

    .line 288
    const-string v7, "\\h"

    .line 289
    .line 290
    const-string v13, "\u00a0"

    .line 291
    .line 292
    invoke-virtual {v3, v7, v13}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 293
    .line 294
    .line 295
    move-result-object v3

    .line 296
    iget v7, v0, Ld4/a;->p:F

    .line 297
    .line 298
    iget v13, v0, Ld4/a;->q:F

    .line 299
    .line 300
    new-instance v14, Landroid/text/SpannableString;

    .line 301
    .line 302
    invoke-direct {v14, v3}, Landroid/text/SpannableString;-><init>(Ljava/lang/CharSequence;)V

    .line 303
    .line 304
    .line 305
    const v17, -0x800001

    .line 306
    .line 307
    .line 308
    const v29, -0x800001

    .line 309
    .line 310
    .line 311
    const/high16 v33, -0x80000000

    .line 312
    .line 313
    if-eqz v6, :cond_15

    .line 314
    .line 315
    iget-object v3, v6, Ld4/d;->c:Ljava/lang/Integer;

    .line 316
    .line 317
    if-eqz v3, :cond_d

    .line 318
    .line 319
    new-instance v0, Landroid/text/style/ForegroundColorSpan;

    .line 320
    .line 321
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 322
    .line 323
    .line 324
    move-result v3

    .line 325
    invoke-direct {v0, v3}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 326
    .line 327
    .line 328
    invoke-virtual {v14}, Landroid/text/SpannableString;->length()I

    .line 329
    .line 330
    .line 331
    move-result v3

    .line 332
    move-object/from16 v35, v4

    .line 333
    .line 334
    move/from16 v20, v7

    .line 335
    .line 336
    const/4 v4, 0x0

    .line 337
    const/16 v7, 0x21

    .line 338
    .line 339
    invoke-virtual {v14, v0, v4, v3, v7}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 340
    .line 341
    .line 342
    goto :goto_6

    .line 343
    :cond_d
    move-object/from16 v35, v4

    .line 344
    .line 345
    move/from16 v20, v7

    .line 346
    .line 347
    :goto_6
    iget v0, v6, Ld4/d;->j:I

    .line 348
    .line 349
    const/4 v3, 0x3

    .line 350
    if-ne v0, v3, :cond_e

    .line 351
    .line 352
    iget-object v0, v6, Ld4/d;->d:Ljava/lang/Integer;

    .line 353
    .line 354
    if-eqz v0, :cond_e

    .line 355
    .line 356
    new-instance v4, Landroid/text/style/BackgroundColorSpan;

    .line 357
    .line 358
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 359
    .line 360
    .line 361
    move-result v0

    .line 362
    invoke-direct {v4, v0}, Landroid/text/style/BackgroundColorSpan;-><init>(I)V

    .line 363
    .line 364
    .line 365
    invoke-virtual {v14}, Landroid/text/SpannableString;->length()I

    .line 366
    .line 367
    .line 368
    move-result v0

    .line 369
    const/16 v3, 0x21

    .line 370
    .line 371
    const/4 v7, 0x0

    .line 372
    invoke-virtual {v14, v4, v7, v0, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 373
    .line 374
    .line 375
    :cond_e
    iget v0, v6, Ld4/d;->e:F

    .line 376
    .line 377
    cmpl-float v3, v0, v17

    .line 378
    .line 379
    if-eqz v3, :cond_f

    .line 380
    .line 381
    cmpl-float v3, v13, v17

    .line 382
    .line 383
    if-eqz v3, :cond_f

    .line 384
    .line 385
    div-float/2addr v0, v13

    .line 386
    const/4 v3, 0x1

    .line 387
    goto :goto_7

    .line 388
    :cond_f
    move/from16 v0, v29

    .line 389
    .line 390
    move/from16 v3, v33

    .line 391
    .line 392
    :goto_7
    iget-boolean v4, v6, Ld4/d;->g:Z

    .line 393
    .line 394
    iget-boolean v7, v6, Ld4/d;->f:Z

    .line 395
    .line 396
    if-eqz v7, :cond_10

    .line 397
    .line 398
    if-eqz v4, :cond_10

    .line 399
    .line 400
    new-instance v4, Landroid/text/style/StyleSpan;

    .line 401
    .line 402
    const/4 v7, 0x3

    .line 403
    invoke-direct {v4, v7}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 404
    .line 405
    .line 406
    invoke-virtual {v14}, Landroid/text/SpannableString;->length()I

    .line 407
    .line 408
    .line 409
    move-result v7

    .line 410
    move/from16 v21, v0

    .line 411
    .line 412
    move/from16 v19, v3

    .line 413
    .line 414
    const/4 v0, 0x0

    .line 415
    const/16 v3, 0x21

    .line 416
    .line 417
    invoke-virtual {v14, v4, v0, v7, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 418
    .line 419
    .line 420
    goto :goto_8

    .line 421
    :cond_10
    move/from16 v21, v0

    .line 422
    .line 423
    move/from16 v19, v3

    .line 424
    .line 425
    const/4 v0, 0x0

    .line 426
    const/16 v3, 0x21

    .line 427
    .line 428
    if-eqz v7, :cond_11

    .line 429
    .line 430
    new-instance v4, Landroid/text/style/StyleSpan;

    .line 431
    .line 432
    const/4 v7, 0x1

    .line 433
    invoke-direct {v4, v7}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 434
    .line 435
    .line 436
    invoke-virtual {v14}, Landroid/text/SpannableString;->length()I

    .line 437
    .line 438
    .line 439
    move-result v7

    .line 440
    invoke-virtual {v14, v4, v0, v7, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 441
    .line 442
    .line 443
    goto :goto_8

    .line 444
    :cond_11
    if-eqz v4, :cond_12

    .line 445
    .line 446
    new-instance v4, Landroid/text/style/StyleSpan;

    .line 447
    .line 448
    const/4 v7, 0x2

    .line 449
    invoke-direct {v4, v7}, Landroid/text/style/StyleSpan;-><init>(I)V

    .line 450
    .line 451
    .line 452
    invoke-virtual {v14}, Landroid/text/SpannableString;->length()I

    .line 453
    .line 454
    .line 455
    move-result v7

    .line 456
    invoke-virtual {v14, v4, v0, v7, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 457
    .line 458
    .line 459
    :cond_12
    :goto_8
    iget-boolean v4, v6, Ld4/d;->h:Z

    .line 460
    .line 461
    if-eqz v4, :cond_13

    .line 462
    .line 463
    new-instance v4, Landroid/text/style/UnderlineSpan;

    .line 464
    .line 465
    invoke-direct {v4}, Landroid/text/style/UnderlineSpan;-><init>()V

    .line 466
    .line 467
    .line 468
    invoke-virtual {v14}, Landroid/text/SpannableString;->length()I

    .line 469
    .line 470
    .line 471
    move-result v7

    .line 472
    invoke-virtual {v14, v4, v0, v7, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 473
    .line 474
    .line 475
    :cond_13
    iget-boolean v4, v6, Ld4/d;->i:Z

    .line 476
    .line 477
    if-eqz v4, :cond_14

    .line 478
    .line 479
    new-instance v4, Landroid/text/style/StrikethroughSpan;

    .line 480
    .line 481
    invoke-direct {v4}, Landroid/text/style/StrikethroughSpan;-><init>()V

    .line 482
    .line 483
    .line 484
    invoke-virtual {v14}, Landroid/text/SpannableString;->length()I

    .line 485
    .line 486
    .line 487
    move-result v7

    .line 488
    invoke-virtual {v14, v4, v0, v7, v3}, Landroid/text/SpannableString;->setSpan(Ljava/lang/Object;III)V

    .line 489
    .line 490
    .line 491
    :cond_14
    move/from16 v27, v19

    .line 492
    .line 493
    move/from16 v28, v21

    .line 494
    .line 495
    :goto_9
    const/4 v3, -0x1

    .line 496
    goto :goto_a

    .line 497
    :cond_15
    move-object/from16 v35, v4

    .line 498
    .line 499
    move/from16 v20, v7

    .line 500
    .line 501
    const/4 v0, 0x0

    .line 502
    move/from16 v28, v29

    .line 503
    .line 504
    move/from16 v27, v33

    .line 505
    .line 506
    goto :goto_9

    .line 507
    :goto_a
    if-eq v15, v3, :cond_16

    .line 508
    .line 509
    move v3, v15

    .line 510
    goto :goto_b

    .line 511
    :cond_16
    if-eqz v6, :cond_17

    .line 512
    .line 513
    iget v3, v6, Ld4/d;->b:I

    .line 514
    .line 515
    :cond_17
    :goto_b
    const-string v4, "Unknown alignment: "

    .line 516
    .line 517
    packed-switch v3, :pswitch_data_0

    .line 518
    .line 519
    .line 520
    :pswitch_0
    invoke-static {v4, v3, v8}, Lcom/google/android/gms/internal/measurement/k1;->v(Ljava/lang/String;ILjava/lang/String;)V

    .line 521
    .line 522
    .line 523
    :pswitch_1
    const/16 v19, 0x0

    .line 524
    .line 525
    goto :goto_d

    .line 526
    :pswitch_2
    sget-object v6, Landroid/text/Layout$Alignment;->ALIGN_OPPOSITE:Landroid/text/Layout$Alignment;

    .line 527
    .line 528
    :goto_c
    move-object/from16 v19, v6

    .line 529
    .line 530
    goto :goto_d

    .line 531
    :pswitch_3
    sget-object v6, Landroid/text/Layout$Alignment;->ALIGN_CENTER:Landroid/text/Layout$Alignment;

    .line 532
    .line 533
    goto :goto_c

    .line 534
    :pswitch_4
    sget-object v6, Landroid/text/Layout$Alignment;->ALIGN_NORMAL:Landroid/text/Layout$Alignment;

    .line 535
    .line 536
    goto :goto_c

    .line 537
    :goto_d
    const/high16 v6, -0x80000000

    .line 538
    .line 539
    packed-switch v3, :pswitch_data_1

    .line 540
    .line 541
    .line 542
    :pswitch_5
    invoke-static {v4, v3, v8}, Lcom/google/android/gms/internal/measurement/k1;->v(Ljava/lang/String;ILjava/lang/String;)V

    .line 543
    .line 544
    .line 545
    :pswitch_6
    move v7, v6

    .line 546
    goto :goto_e

    .line 547
    :pswitch_7
    const/4 v7, 0x2

    .line 548
    goto :goto_e

    .line 549
    :pswitch_8
    const/4 v7, 0x1

    .line 550
    goto :goto_e

    .line 551
    :pswitch_9
    move v7, v0

    .line 552
    :goto_e
    packed-switch v3, :pswitch_data_2

    .line 553
    .line 554
    .line 555
    :pswitch_a
    invoke-static {v4, v3, v8}, Lcom/google/android/gms/internal/measurement/k1;->v(Ljava/lang/String;ILjava/lang/String;)V

    .line 556
    .line 557
    .line 558
    goto :goto_f

    .line 559
    :pswitch_b
    move v6, v0

    .line 560
    goto :goto_f

    .line 561
    :pswitch_c
    const/4 v6, 0x1

    .line 562
    goto :goto_f

    .line 563
    :pswitch_d
    const/4 v6, 0x2

    .line 564
    :goto_f
    :pswitch_e
    if-eqz v5, :cond_18

    .line 565
    .line 566
    cmpl-float v3, v13, v17

    .line 567
    .line 568
    if-eqz v3, :cond_18

    .line 569
    .line 570
    cmpl-float v3, v20, v17

    .line 571
    .line 572
    if-eqz v3, :cond_18

    .line 573
    .line 574
    iget v3, v5, Landroid/graphics/PointF;->x:F

    .line 575
    .line 576
    div-float v3, v3, v20

    .line 577
    .line 578
    iget v4, v5, Landroid/graphics/PointF;->y:F

    .line 579
    .line 580
    div-float/2addr v4, v13

    .line 581
    move/from16 v25, v3

    .line 582
    .line 583
    move/from16 v22, v4

    .line 584
    .line 585
    goto :goto_12

    .line 586
    :cond_18
    const v3, 0x3d4ccccd    # 0.05f

    .line 587
    .line 588
    .line 589
    const/high16 v4, 0x3f000000    # 0.5f

    .line 590
    .line 591
    const v5, 0x3f733333    # 0.95f

    .line 592
    .line 593
    .line 594
    if-eqz v7, :cond_1b

    .line 595
    .line 596
    const/4 v13, 0x1

    .line 597
    if-eq v7, v13, :cond_1a

    .line 598
    .line 599
    const/4 v8, 0x2

    .line 600
    if-eq v7, v8, :cond_19

    .line 601
    .line 602
    move/from16 v15, v17

    .line 603
    .line 604
    goto :goto_10

    .line 605
    :cond_19
    move v15, v5

    .line 606
    goto :goto_10

    .line 607
    :cond_1a
    const/4 v8, 0x2

    .line 608
    move v15, v4

    .line 609
    goto :goto_10

    .line 610
    :cond_1b
    const/4 v8, 0x2

    .line 611
    const/4 v13, 0x1

    .line 612
    move v15, v3

    .line 613
    :goto_10
    if-eqz v6, :cond_1e

    .line 614
    .line 615
    if-eq v6, v13, :cond_1d

    .line 616
    .line 617
    if-eq v6, v8, :cond_1c

    .line 618
    .line 619
    move/from16 v3, v17

    .line 620
    .line 621
    goto :goto_11

    .line 622
    :cond_1c
    move v3, v5

    .line 623
    goto :goto_11

    .line 624
    :cond_1d
    move v3, v4

    .line 625
    :cond_1e
    :goto_11
    move/from16 v22, v3

    .line 626
    .line 627
    move/from16 v25, v15

    .line 628
    .line 629
    :goto_12
    new-instance v17, LY3/b;

    .line 630
    .line 631
    const/16 v20, 0x0

    .line 632
    .line 633
    const/16 v31, 0x0

    .line 634
    .line 635
    const/high16 v32, -0x1000000

    .line 636
    .line 637
    const/16 v34, 0x0

    .line 638
    .line 639
    move-object/from16 v21, v20

    .line 640
    .line 641
    move/from16 v30, v29

    .line 642
    .line 643
    move/from16 v23, v0

    .line 644
    .line 645
    move/from16 v24, v6

    .line 646
    .line 647
    move/from16 v26, v7

    .line 648
    .line 649
    move-object/from16 v18, v14

    .line 650
    .line 651
    invoke-direct/range {v17 .. v34}, LY3/b;-><init>(Ljava/lang/CharSequence;Landroid/text/Layout$Alignment;Landroid/text/Layout$Alignment;Landroid/graphics/Bitmap;FIIFIIFFFZIIF)V

    .line 652
    .line 653
    .line 654
    move-object/from16 v0, v17

    .line 655
    .line 656
    invoke-static {v9, v10, v2, v1}, Ld4/a;->i(JLjava/util/ArrayList;Ljava/util/ArrayList;)I

    .line 657
    .line 658
    .line 659
    move-result v3

    .line 660
    invoke-static {v11, v12, v2, v1}, Ld4/a;->i(JLjava/util/ArrayList;Ljava/util/ArrayList;)I

    .line 661
    .line 662
    .line 663
    move-result v4

    .line 664
    :goto_13
    if-ge v3, v4, :cond_1f

    .line 665
    .line 666
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 667
    .line 668
    .line 669
    move-result-object v5

    .line 670
    check-cast v5, Ljava/util/List;

    .line 671
    .line 672
    invoke-interface {v5, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 673
    .line 674
    .line 675
    add-int/lit8 v3, v3, 0x1

    .line 676
    .line 677
    goto :goto_13

    .line 678
    :cond_1f
    :goto_14
    move-object/from16 v0, p0

    .line 679
    .line 680
    move-object/from16 v3, v16

    .line 681
    .line 682
    move-object/from16 v4, v35

    .line 683
    .line 684
    goto/16 :goto_0

    .line 685
    .line 686
    :cond_20
    new-instance v0, Ld4/e;

    .line 687
    .line 688
    invoke-direct {v0, v1, v2}, Ld4/e;-><init>(Ljava/util/ArrayList;Ljava/util/ArrayList;)V

    .line 689
    .line 690
    .line 691
    return-object v0

    .line 692
    nop

    .line 693
    :pswitch_data_0
    .packed-switch -0x1
        :pswitch_1
        :pswitch_0
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_4
        :pswitch_3
        :pswitch_2
    .end packed-switch

    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    :pswitch_data_1
    .packed-switch -0x1
        :pswitch_6
        :pswitch_5
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_9
        :pswitch_8
        :pswitch_7
        :pswitch_9
        :pswitch_8
        :pswitch_7
    .end packed-switch

    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    :pswitch_data_2
    .packed-switch -0x1
        :pswitch_e
        :pswitch_a
        :pswitch_d
        :pswitch_d
        :pswitch_d
        :pswitch_c
        :pswitch_c
        :pswitch_c
        :pswitch_b
        :pswitch_b
        :pswitch_b
    .end packed-switch
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
.end method

.method public final j(LA4/r;)V
    .locals 37

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    const/4 v2, 0x6

    .line 4
    const/4 v3, 0x3

    .line 5
    const/4 v4, 0x7

    .line 6
    const/4 v5, -0x1

    .line 7
    const/4 v6, 0x2

    .line 8
    const/4 v7, 0x0

    .line 9
    const/4 v8, 0x1

    .line 10
    :cond_0
    :goto_0
    invoke-virtual/range {p1 .. p1}, LA4/r;->j()Ljava/lang/String;

    .line 11
    .line 12
    .line 13
    move-result-object v0

    .line 14
    if-eqz v0, :cond_25

    .line 15
    .line 16
    const-string v9, "[Script Info]"

    .line 17
    .line 18
    invoke-virtual {v9, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 19
    .line 20
    .line 21
    move-result v9

    .line 22
    const/16 v10, 0x5b

    .line 23
    .line 24
    if-eqz v9, :cond_5

    .line 25
    .line 26
    :catch_0
    :goto_1
    invoke-virtual/range {p1 .. p1}, LA4/r;->j()Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object v0

    .line 30
    if-eqz v0, :cond_0

    .line 31
    .line 32
    invoke-virtual/range {p1 .. p1}, LA4/r;->e()I

    .line 33
    .line 34
    .line 35
    move-result v9

    .line 36
    if-eqz v9, :cond_1

    .line 37
    .line 38
    invoke-virtual/range {p1 .. p1}, LA4/r;->g()I

    .line 39
    .line 40
    .line 41
    move-result v9

    .line 42
    if-eq v9, v10, :cond_0

    .line 43
    .line 44
    :cond_1
    const-string v9, ":"

    .line 45
    .line 46
    invoke-virtual {v0, v9}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    array-length v9, v0

    .line 51
    if-eq v9, v6, :cond_2

    .line 52
    .line 53
    goto :goto_1

    .line 54
    :cond_2
    aget-object v9, v0, v7

    .line 55
    .line 56
    invoke-virtual {v9}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 57
    .line 58
    .line 59
    move-result-object v9

    .line 60
    invoke-static {v9}, LB6/u0;->L(Ljava/lang/String;)Ljava/lang/String;

    .line 61
    .line 62
    .line 63
    move-result-object v9

    .line 64
    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    const-string v11, "playresx"

    .line 68
    .line 69
    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result v11

    .line 73
    if-nez v11, :cond_4

    .line 74
    .line 75
    const-string v11, "playresy"

    .line 76
    .line 77
    invoke-virtual {v9, v11}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 78
    .line 79
    .line 80
    move-result v9

    .line 81
    if-nez v9, :cond_3

    .line 82
    .line 83
    goto :goto_1

    .line 84
    :cond_3
    :try_start_0
    aget-object v0, v0, v8

    .line 85
    .line 86
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    move-result-object v0

    .line 90
    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 91
    .line 92
    .line 93
    move-result v0

    .line 94
    iput v0, v1, Ld4/a;->q:F

    .line 95
    .line 96
    goto :goto_1

    .line 97
    :cond_4
    aget-object v0, v0, v8

    .line 98
    .line 99
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 100
    .line 101
    .line 102
    move-result-object v0

    .line 103
    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 104
    .line 105
    .line 106
    move-result v0

    .line 107
    iput v0, v1, Ld4/a;->p:F
    :try_end_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    .line 108
    .line 109
    goto :goto_1

    .line 110
    :cond_5
    const-string v9, "[V4+ Styles]"

    .line 111
    .line 112
    invoke-virtual {v9, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 113
    .line 114
    .line 115
    move-result v9

    .line 116
    const-string v11, "SsaDecoder"

    .line 117
    .line 118
    if-eqz v9, :cond_23

    .line 119
    .line 120
    new-instance v9, Ljava/util/LinkedHashMap;

    .line 121
    .line 122
    invoke-direct {v9}, Ljava/util/LinkedHashMap;-><init>()V

    .line 123
    .line 124
    .line 125
    const/4 v12, 0x0

    .line 126
    move-object v13, v12

    .line 127
    :goto_2
    invoke-virtual/range {p1 .. p1}, LA4/r;->j()Ljava/lang/String;

    .line 128
    .line 129
    .line 130
    move-result-object v14

    .line 131
    if-eqz v14, :cond_21

    .line 132
    .line 133
    invoke-virtual/range {p1 .. p1}, LA4/r;->e()I

    .line 134
    .line 135
    .line 136
    move-result v0

    .line 137
    if-eqz v0, :cond_6

    .line 138
    .line 139
    invoke-virtual/range {p1 .. p1}, LA4/r;->g()I

    .line 140
    .line 141
    .line 142
    move-result v0

    .line 143
    if-eq v0, v10, :cond_21

    .line 144
    .line 145
    :cond_6
    const-string v0, "Format:"

    .line 146
    .line 147
    invoke-virtual {v14, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 148
    .line 149
    .line 150
    move-result v0

    .line 151
    const-string v15, ","

    .line 152
    .line 153
    if-eqz v0, :cond_13

    .line 154
    .line 155
    invoke-virtual {v14, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 156
    .line 157
    .line 158
    move-result-object v0

    .line 159
    invoke-static {v0, v15}, Landroid/text/TextUtils;->split(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    .line 160
    .line 161
    .line 162
    move-result-object v0

    .line 163
    move v15, v5

    .line 164
    move/from16 v16, v15

    .line 165
    .line 166
    move/from16 v17, v16

    .line 167
    .line 168
    move/from16 v18, v17

    .line 169
    .line 170
    move/from16 v19, v18

    .line 171
    .line 172
    move/from16 v20, v19

    .line 173
    .line 174
    move/from16 v21, v20

    .line 175
    .line 176
    move/from16 v22, v21

    .line 177
    .line 178
    move/from16 v23, v22

    .line 179
    .line 180
    move/from16 v24, v23

    .line 181
    .line 182
    move v13, v7

    .line 183
    :goto_3
    array-length v14, v0

    .line 184
    if-ge v13, v14, :cond_11

    .line 185
    .line 186
    aget-object v14, v0, v13

    .line 187
    .line 188
    invoke-virtual {v14}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 189
    .line 190
    .line 191
    move-result-object v14

    .line 192
    invoke-static {v14}, LB6/u0;->L(Ljava/lang/String;)Ljava/lang/String;

    .line 193
    .line 194
    .line 195
    move-result-object v14

    .line 196
    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v14}, Ljava/lang/String;->hashCode()I

    .line 200
    .line 201
    .line 202
    move-result v25

    .line 203
    sparse-switch v25, :sswitch_data_0

    .line 204
    .line 205
    .line 206
    :goto_4
    move v4, v5

    .line 207
    goto/16 :goto_5

    .line 208
    .line 209
    :sswitch_0
    const-string v4, "outlinecolour"

    .line 210
    .line 211
    invoke-virtual {v14, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 212
    .line 213
    .line 214
    move-result v4

    .line 215
    if-nez v4, :cond_7

    .line 216
    .line 217
    goto :goto_4

    .line 218
    :cond_7
    const/16 v4, 0x9

    .line 219
    .line 220
    goto/16 :goto_5

    .line 221
    .line 222
    :sswitch_1
    const-string v4, "alignment"

    .line 223
    .line 224
    invoke-virtual {v14, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 225
    .line 226
    .line 227
    move-result v4

    .line 228
    if-nez v4, :cond_8

    .line 229
    .line 230
    goto :goto_4

    .line 231
    :cond_8
    const/16 v4, 0x8

    .line 232
    .line 233
    goto/16 :goto_5

    .line 234
    .line 235
    :sswitch_2
    const-string v4, "borderstyle"

    .line 236
    .line 237
    invoke-virtual {v14, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 238
    .line 239
    .line 240
    move-result v4

    .line 241
    if-nez v4, :cond_9

    .line 242
    .line 243
    goto :goto_4

    .line 244
    :cond_9
    const/4 v4, 0x7

    .line 245
    goto :goto_5

    .line 246
    :sswitch_3
    const-string v4, "fontsize"

    .line 247
    .line 248
    invoke-virtual {v14, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 249
    .line 250
    .line 251
    move-result v4

    .line 252
    if-nez v4, :cond_a

    .line 253
    .line 254
    goto :goto_4

    .line 255
    :cond_a
    move v4, v2

    .line 256
    goto :goto_5

    .line 257
    :sswitch_4
    const-string v4, "name"

    .line 258
    .line 259
    invoke-virtual {v14, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 260
    .line 261
    .line 262
    move-result v4

    .line 263
    if-nez v4, :cond_b

    .line 264
    .line 265
    goto :goto_4

    .line 266
    :cond_b
    const/4 v4, 0x5

    .line 267
    goto :goto_5

    .line 268
    :sswitch_5
    const-string v4, "bold"

    .line 269
    .line 270
    invoke-virtual {v14, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 271
    .line 272
    .line 273
    move-result v4

    .line 274
    if-nez v4, :cond_c

    .line 275
    .line 276
    goto :goto_4

    .line 277
    :cond_c
    const/4 v4, 0x4

    .line 278
    goto :goto_5

    .line 279
    :sswitch_6
    const-string v4, "primarycolour"

    .line 280
    .line 281
    invoke-virtual {v14, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 282
    .line 283
    .line 284
    move-result v4

    .line 285
    if-nez v4, :cond_d

    .line 286
    .line 287
    goto :goto_4

    .line 288
    :cond_d
    move v4, v3

    .line 289
    goto :goto_5

    .line 290
    :sswitch_7
    const-string v4, "strikeout"

    .line 291
    .line 292
    invoke-virtual {v14, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 293
    .line 294
    .line 295
    move-result v4

    .line 296
    if-nez v4, :cond_e

    .line 297
    .line 298
    goto :goto_4

    .line 299
    :cond_e
    move v4, v6

    .line 300
    goto :goto_5

    .line 301
    :sswitch_8
    const-string v4, "underline"

    .line 302
    .line 303
    invoke-virtual {v14, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 304
    .line 305
    .line 306
    move-result v4

    .line 307
    if-nez v4, :cond_f

    .line 308
    .line 309
    goto :goto_4

    .line 310
    :cond_f
    move v4, v8

    .line 311
    goto :goto_5

    .line 312
    :sswitch_9
    const-string v4, "italic"

    .line 313
    .line 314
    invoke-virtual {v14, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 315
    .line 316
    .line 317
    move-result v4

    .line 318
    if-nez v4, :cond_10

    .line 319
    .line 320
    goto :goto_4

    .line 321
    :cond_10
    move v4, v7

    .line 322
    :goto_5
    packed-switch v4, :pswitch_data_0

    .line 323
    .line 324
    .line 325
    goto :goto_6

    .line 326
    :pswitch_0
    move/from16 v18, v13

    .line 327
    .line 328
    goto :goto_6

    .line 329
    :pswitch_1
    move/from16 v16, v13

    .line 330
    .line 331
    goto :goto_6

    .line 332
    :pswitch_2
    move/from16 v24, v13

    .line 333
    .line 334
    goto :goto_6

    .line 335
    :pswitch_3
    move/from16 v19, v13

    .line 336
    .line 337
    goto :goto_6

    .line 338
    :pswitch_4
    move v15, v13

    .line 339
    goto :goto_6

    .line 340
    :pswitch_5
    move/from16 v20, v13

    .line 341
    .line 342
    goto :goto_6

    .line 343
    :pswitch_6
    move/from16 v17, v13

    .line 344
    .line 345
    goto :goto_6

    .line 346
    :pswitch_7
    move/from16 v23, v13

    .line 347
    .line 348
    goto :goto_6

    .line 349
    :pswitch_8
    move/from16 v22, v13

    .line 350
    .line 351
    goto :goto_6

    .line 352
    :pswitch_9
    move/from16 v21, v13

    .line 353
    .line 354
    :goto_6
    add-int/2addr v13, v8

    .line 355
    const/4 v4, 0x7

    .line 356
    goto/16 :goto_3

    .line 357
    .line 358
    :cond_11
    if-eq v15, v5, :cond_12

    .line 359
    .line 360
    new-instance v14, Ld4/b;

    .line 361
    .line 362
    array-length v0, v0

    .line 363
    move/from16 v25, v0

    .line 364
    .line 365
    invoke-direct/range {v14 .. v25}, Ld4/b;-><init>(IIIIIIIIIII)V

    .line 366
    .line 367
    .line 368
    move-object v13, v14

    .line 369
    goto :goto_7

    .line 370
    :cond_12
    move-object v13, v12

    .line 371
    :goto_7
    const/4 v4, 0x7

    .line 372
    goto/16 :goto_2

    .line 373
    .line 374
    :cond_13
    const-string v0, "Style:"

    .line 375
    .line 376
    invoke-virtual {v14, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 377
    .line 378
    .line 379
    move-result v4

    .line 380
    if-eqz v4, :cond_20

    .line 381
    .line 382
    if-nez v13, :cond_14

    .line 383
    .line 384
    const-string v0, "Skipping \'Style:\' line before \'Format:\' line: "

    .line 385
    .line 386
    invoke-virtual {v0, v14}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 387
    .line 388
    .line 389
    move-result-object v0

    .line 390
    invoke-static {v11, v0}, Ll4/a;->P(Ljava/lang/String;Ljava/lang/String;)V

    .line 391
    .line 392
    .line 393
    goto/16 :goto_15

    .line 394
    .line 395
    :cond_14
    invoke-virtual {v14, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z

    .line 396
    .line 397
    .line 398
    move-result v0

    .line 399
    invoke-static {v0}, Ll4/a;->h(Z)V

    .line 400
    .line 401
    .line 402
    invoke-virtual {v14, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 403
    .line 404
    .line 405
    move-result-object v0

    .line 406
    invoke-static {v0, v15}, Landroid/text/TextUtils;->split(Ljava/lang/String;Ljava/lang/String;)[Ljava/lang/String;

    .line 407
    .line 408
    .line 409
    move-result-object v4

    .line 410
    array-length v0, v4

    .line 411
    iget v15, v13, Ld4/b;->k:I

    .line 412
    .line 413
    const-string v2, "\'"

    .line 414
    .line 415
    const-string v6, "SsaStyle"

    .line 416
    .line 417
    if-eq v0, v15, :cond_15

    .line 418
    .line 419
    array-length v0, v4

    .line 420
    sget v4, Ll4/y;->a:I

    .line 421
    .line 422
    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 423
    .line 424
    new-instance v4, Ljava/lang/StringBuilder;

    .line 425
    .line 426
    const-string v7, "Skipping malformed \'Style:\' line (expected "

    .line 427
    .line 428
    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 429
    .line 430
    .line 431
    invoke-virtual {v4, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 432
    .line 433
    .line 434
    const-string v7, " values, found "

    .line 435
    .line 436
    invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 437
    .line 438
    .line 439
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 440
    .line 441
    .line 442
    const-string v0, "): \'"

    .line 443
    .line 444
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 445
    .line 446
    .line 447
    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 448
    .line 449
    .line 450
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 451
    .line 452
    .line 453
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 454
    .line 455
    .line 456
    move-result-object v0

    .line 457
    invoke-static {v6, v0}, Ll4/a;->P(Ljava/lang/String;Ljava/lang/String;)V

    .line 458
    .line 459
    .line 460
    :goto_8
    move-object v0, v12

    .line 461
    goto/16 :goto_14

    .line 462
    .line 463
    :cond_15
    :try_start_1
    new-instance v26, Ld4/d;

    .line 464
    .line 465
    iget v0, v13, Ld4/b;->a:I

    .line 466
    .line 467
    aget-object v0, v4, v0

    .line 468
    .line 469
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 470
    .line 471
    .line 472
    move-result-object v27

    .line 473
    iget v0, v13, Ld4/b;->b:I

    .line 474
    .line 475
    if-eq v0, v5, :cond_16

    .line 476
    .line 477
    aget-object v0, v4, v0

    .line 478
    .line 479
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 480
    .line 481
    .line 482
    move-result-object v0

    .line 483
    invoke-static {v0}, Ld4/d;->a(Ljava/lang/String;)I

    .line 484
    .line 485
    .line 486
    move-result v0

    .line 487
    move/from16 v28, v0

    .line 488
    .line 489
    goto :goto_9

    .line 490
    :catch_1
    move-exception v0

    .line 491
    goto/16 :goto_13

    .line 492
    .line 493
    :cond_16
    move/from16 v28, v5

    .line 494
    .line 495
    :goto_9
    iget v0, v13, Ld4/b;->c:I

    .line 496
    .line 497
    if-eq v0, v5, :cond_17

    .line 498
    .line 499
    aget-object v0, v4, v0

    .line 500
    .line 501
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 502
    .line 503
    .line 504
    move-result-object v0

    .line 505
    invoke-static {v0}, Ld4/d;->c(Ljava/lang/String;)Ljava/lang/Integer;

    .line 506
    .line 507
    .line 508
    move-result-object v0

    .line 509
    move-object/from16 v29, v0

    .line 510
    .line 511
    goto :goto_a

    .line 512
    :cond_17
    move-object/from16 v29, v12

    .line 513
    .line 514
    :goto_a
    iget v0, v13, Ld4/b;->d:I

    .line 515
    .line 516
    if-eq v0, v5, :cond_18

    .line 517
    .line 518
    aget-object v0, v4, v0

    .line 519
    .line 520
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 521
    .line 522
    .line 523
    move-result-object v0

    .line 524
    invoke-static {v0}, Ld4/d;->c(Ljava/lang/String;)Ljava/lang/Integer;

    .line 525
    .line 526
    .line 527
    move-result-object v0

    .line 528
    move-object/from16 v30, v0

    .line 529
    .line 530
    goto :goto_b

    .line 531
    :cond_18
    move-object/from16 v30, v12

    .line 532
    .line 533
    :goto_b
    iget v0, v13, Ld4/b;->e:I

    .line 534
    .line 535
    if-eq v0, v5, :cond_19

    .line 536
    .line 537
    aget-object v0, v4, v0

    .line 538
    .line 539
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 540
    .line 541
    .line 542
    move-result-object v15
    :try_end_1
    .catch Ljava/lang/RuntimeException; {:try_start_1 .. :try_end_1} :catch_1

    .line 543
    :try_start_2
    invoke-static {v15}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    .line 544
    .line 545
    .line 546
    move-result v7
    :try_end_2
    .catch Ljava/lang/NumberFormatException; {:try_start_2 .. :try_end_2} :catch_2
    .catch Ljava/lang/RuntimeException; {:try_start_2 .. :try_end_2} :catch_1

    .line 547
    goto :goto_c

    .line 548
    :catch_2
    move-exception v0

    .line 549
    :try_start_3
    new-instance v7, Ljava/lang/StringBuilder;

    .line 550
    .line 551
    const-string v10, "Failed to parse font size: \'"

    .line 552
    .line 553
    invoke-direct {v7, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 554
    .line 555
    .line 556
    invoke-virtual {v7, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 557
    .line 558
    .line 559
    invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 560
    .line 561
    .line 562
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 563
    .line 564
    .line 565
    move-result-object v7

    .line 566
    invoke-static {v6, v7, v0}, Ll4/a;->Q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 567
    .line 568
    .line 569
    const v7, -0x800001

    .line 570
    .line 571
    .line 572
    :goto_c
    move/from16 v31, v7

    .line 573
    .line 574
    goto :goto_d

    .line 575
    :cond_19
    const v31, -0x800001

    .line 576
    .line 577
    .line 578
    :goto_d
    iget v0, v13, Ld4/b;->f:I

    .line 579
    .line 580
    if-eq v0, v5, :cond_1a

    .line 581
    .line 582
    aget-object v0, v4, v0

    .line 583
    .line 584
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 585
    .line 586
    .line 587
    move-result-object v0

    .line 588
    invoke-static {v0}, Ld4/d;->b(Ljava/lang/String;)Z

    .line 589
    .line 590
    .line 591
    move-result v0

    .line 592
    if-eqz v0, :cond_1a

    .line 593
    .line 594
    move/from16 v32, v8

    .line 595
    .line 596
    goto :goto_e

    .line 597
    :cond_1a
    const/16 v32, 0x0

    .line 598
    .line 599
    :goto_e
    iget v0, v13, Ld4/b;->g:I

    .line 600
    .line 601
    if-eq v0, v5, :cond_1b

    .line 602
    .line 603
    aget-object v0, v4, v0

    .line 604
    .line 605
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 606
    .line 607
    .line 608
    move-result-object v0

    .line 609
    invoke-static {v0}, Ld4/d;->b(Ljava/lang/String;)Z

    .line 610
    .line 611
    .line 612
    move-result v0

    .line 613
    if-eqz v0, :cond_1b

    .line 614
    .line 615
    move/from16 v33, v8

    .line 616
    .line 617
    goto :goto_f

    .line 618
    :cond_1b
    const/16 v33, 0x0

    .line 619
    .line 620
    :goto_f
    iget v0, v13, Ld4/b;->h:I

    .line 621
    .line 622
    if-eq v0, v5, :cond_1c

    .line 623
    .line 624
    aget-object v0, v4, v0

    .line 625
    .line 626
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 627
    .line 628
    .line 629
    move-result-object v0

    .line 630
    invoke-static {v0}, Ld4/d;->b(Ljava/lang/String;)Z

    .line 631
    .line 632
    .line 633
    move-result v0

    .line 634
    if-eqz v0, :cond_1c

    .line 635
    .line 636
    move/from16 v34, v8

    .line 637
    .line 638
    goto :goto_10

    .line 639
    :cond_1c
    const/16 v34, 0x0

    .line 640
    .line 641
    :goto_10
    iget v0, v13, Ld4/b;->i:I

    .line 642
    .line 643
    if-eq v0, v5, :cond_1d

    .line 644
    .line 645
    aget-object v0, v4, v0

    .line 646
    .line 647
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 648
    .line 649
    .line 650
    move-result-object v0

    .line 651
    invoke-static {v0}, Ld4/d;->b(Ljava/lang/String;)Z

    .line 652
    .line 653
    .line 654
    move-result v0

    .line 655
    if-eqz v0, :cond_1d

    .line 656
    .line 657
    move/from16 v35, v8

    .line 658
    .line 659
    goto :goto_11

    .line 660
    :cond_1d
    const/16 v35, 0x0

    .line 661
    .line 662
    :goto_11
    iget v0, v13, Ld4/b;->j:I

    .line 663
    .line 664
    if-eq v0, v5, :cond_1f

    .line 665
    .line 666
    aget-object v0, v4, v0

    .line 667
    .line 668
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 669
    .line 670
    .line 671
    move-result-object v0
    :try_end_3
    .catch Ljava/lang/RuntimeException; {:try_start_3 .. :try_end_3} :catch_1

    .line 672
    :try_start_4
    invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 673
    .line 674
    .line 675
    move-result-object v4

    .line 676
    invoke-static {v4}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 677
    .line 678
    .line 679
    move-result v4
    :try_end_4
    .catch Ljava/lang/NumberFormatException; {:try_start_4 .. :try_end_4} :catch_3
    .catch Ljava/lang/RuntimeException; {:try_start_4 .. :try_end_4} :catch_1

    .line 680
    if-eq v4, v8, :cond_1e

    .line 681
    .line 682
    if-eq v4, v3, :cond_1e

    .line 683
    .line 684
    :catch_3
    :try_start_5
    new-instance v4, Ljava/lang/StringBuilder;

    .line 685
    .line 686
    const-string v7, "Ignoring unknown BorderStyle: "

    .line 687
    .line 688
    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 689
    .line 690
    .line 691
    invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 692
    .line 693
    .line 694
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 695
    .line 696
    .line 697
    move-result-object v0

    .line 698
    invoke-static {v6, v0}, Ll4/a;->P(Ljava/lang/String;Ljava/lang/String;)V

    .line 699
    .line 700
    .line 701
    move v4, v5

    .line 702
    :cond_1e
    move/from16 v36, v4

    .line 703
    .line 704
    goto :goto_12

    .line 705
    :cond_1f
    move/from16 v36, v5

    .line 706
    .line 707
    :goto_12
    invoke-direct/range {v26 .. v36}, Ld4/d;-><init>(Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/Integer;FZZZZI)V
    :try_end_5
    .catch Ljava/lang/RuntimeException; {:try_start_5 .. :try_end_5} :catch_1

    .line 708
    .line 709
    .line 710
    move-object/from16 v0, v26

    .line 711
    .line 712
    goto :goto_14

    .line 713
    :goto_13
    new-instance v4, Ljava/lang/StringBuilder;

    .line 714
    .line 715
    const-string v7, "Skipping malformed \'Style:\' line: \'"

    .line 716
    .line 717
    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 718
    .line 719
    .line 720
    invoke-virtual {v4, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 721
    .line 722
    .line 723
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 724
    .line 725
    .line 726
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 727
    .line 728
    .line 729
    move-result-object v2

    .line 730
    invoke-static {v6, v2, v0}, Ll4/a;->Q(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V

    .line 731
    .line 732
    .line 733
    goto/16 :goto_8

    .line 734
    .line 735
    :goto_14
    if-eqz v0, :cond_20

    .line 736
    .line 737
    iget-object v2, v0, Ld4/d;->a:Ljava/lang/String;

    .line 738
    .line 739
    invoke-interface {v9, v2, v0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 740
    .line 741
    .line 742
    :cond_20
    :goto_15
    const/4 v2, 0x6

    .line 743
    const/4 v4, 0x7

    .line 744
    const/4 v6, 0x2

    .line 745
    const/4 v7, 0x0

    .line 746
    const/16 v10, 0x5b

    .line 747
    .line 748
    goto/16 :goto_2

    .line 749
    .line 750
    :cond_21
    iput-object v9, v1, Ld4/a;->o:Ljava/util/LinkedHashMap;

    .line 751
    .line 752
    :cond_22
    :goto_16
    const/4 v2, 0x6

    .line 753
    const/4 v4, 0x7

    .line 754
    const/4 v6, 0x2

    .line 755
    const/4 v7, 0x0

    .line 756
    goto/16 :goto_0

    .line 757
    .line 758
    :cond_23
    const-string v2, "[V4 Styles]"

    .line 759
    .line 760
    invoke-virtual {v2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 761
    .line 762
    .line 763
    move-result v2

    .line 764
    if-eqz v2, :cond_24

    .line 765
    .line 766
    const-string v0, "[V4 Styles] are not supported"

    .line 767
    .line 768
    invoke-static {v11, v0}, Ll4/a;->A(Ljava/lang/String;Ljava/lang/String;)V

    .line 769
    .line 770
    .line 771
    goto :goto_16

    .line 772
    :cond_24
    const-string v2, "[Events]"

    .line 773
    .line 774
    invoke-virtual {v2, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    .line 775
    .line 776
    .line 777
    move-result v0

    .line 778
    if-eqz v0, :cond_22

    .line 779
    .line 780
    :cond_25
    return-void

    .line 781
    :sswitch_data_0
    .sparse-switch
        -0x4642c5d0 -> :sswitch_9
        -0x3d363934 -> :sswitch_8
        -0xb7325a4 -> :sswitch_7
        -0x43a3db2 -> :sswitch_6
        0x2e3a85 -> :sswitch_5
        0x337a8b -> :sswitch_4
        0x15d92cd0 -> :sswitch_3
        0x2dbc6505 -> :sswitch_2
        0x695fa1e3 -> :sswitch_1
        0x76840c8e -> :sswitch_0
    .end sparse-switch

    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    :pswitch_data_0
    .packed-switch 0x0
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
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
    .line 1364
    .line 1365
    .line 1366
    .line 1367
    .line 1368
    .line 1369
    .line 1370
    .line 1371
    .line 1372
    .line 1373
    .line 1374
    .line 1375
    .line 1376
    .line 1377
    .line 1378
    .line 1379
    .line 1380
    .line 1381
    .line 1382
    .line 1383
    .line 1384
    .line 1385
    .line 1386
    .line 1387
    .line 1388
    .line 1389
    .line 1390
    .line 1391
    .line 1392
    .line 1393
    .line 1394
    .line 1395
    .line 1396
    .line 1397
    .line 1398
    .line 1399
    .line 1400
    .line 1401
    .line 1402
    .line 1403
    .line 1404
    .line 1405
    .line 1406
    .line 1407
    .line 1408
    .line 1409
    .line 1410
    .line 1411
    .line 1412
    .line 1413
    .line 1414
    .line 1415
    .line 1416
    .line 1417
    .line 1418
    .line 1419
    .line 1420
    .line 1421
    .line 1422
    .line 1423
    .line 1424
    .line 1425
    .line 1426
    .line 1427
    .line 1428
    .line 1429
    .line 1430
    .line 1431
    .line 1432
    .line 1433
    .line 1434
    .line 1435
    .line 1436
    .line 1437
    .line 1438
    .line 1439
    .line 1440
    .line 1441
    .line 1442
    .line 1443
    .line 1444
    .line 1445
    .line 1446
    .line 1447
    .line 1448
    .line 1449
    .line 1450
    .line 1451
    .line 1452
    .line 1453
    .line 1454
    .line 1455
    .line 1456
    .line 1457
    .line 1458
    .line 1459
    .line 1460
    .line 1461
    .line 1462
    .line 1463
    .line 1464
    .line 1465
    .line 1466
    .line 1467
    .line 1468
    .line 1469
    .line 1470
    .line 1471
    .line 1472
    .line 1473
    .line 1474
    .line 1475
    .line 1476
    .line 1477
    .line 1478
    .line 1479
    .line 1480
    .line 1481
    .line 1482
    .line 1483
    .line 1484
    .line 1485
    .line 1486
    .line 1487
    .line 1488
    .line 1489
    .line 1490
    .line 1491
    .line 1492
    .line 1493
    .line 1494
    .line 1495
    .line 1496
    .line 1497
    .line 1498
    .line 1499
    .line 1500
    .line 1501
    .line 1502
    .line 1503
    .line 1504
    .line 1505
    .line 1506
    .line 1507
    .line 1508
    .line 1509
    .line 1510
    .line 1511
    .line 1512
    .line 1513
    .line 1514
    .line 1515
    .line 1516
    .line 1517
    .line 1518
    .line 1519
    .line 1520
    .line 1521
    .line 1522
    .line 1523
    .line 1524
    .line 1525
    .line 1526
    .line 1527
    .line 1528
    .line 1529
    .line 1530
    .line 1531
    .line 1532
    .line 1533
    .line 1534
    .line 1535
    .line 1536
    .line 1537
    .line 1538
    .line 1539
    .line 1540
    .line 1541
    .line 1542
    .line 1543
    .line 1544
    .line 1545
    .line 1546
    .line 1547
    .line 1548
    .line 1549
    .line 1550
    .line 1551
    .line 1552
    .line 1553
    .line 1554
    .line 1555
    .line 1556
    .line 1557
    .line 1558
    .line 1559
    .line 1560
    .line 1561
    .line 1562
    .line 1563
    .line 1564
    .line 1565
    .line 1566
    .line 1567
    .line 1568
    .line 1569
    .line 1570
    .line 1571
    .line 1572
    .line 1573
    .line 1574
    .line 1575
    .line 1576
    .line 1577
    .line 1578
    .line 1579
    .line 1580
    .line 1581
    .line 1582
    .line 1583
    .line 1584
    .line 1585
    .line 1586
    .line 1587
    .line 1588
    .line 1589
    .line 1590
    .line 1591
    .line 1592
    .line 1593
    .line 1594
    .line 1595
    .line 1596
    .line 1597
    .line 1598
    .line 1599
    .line 1600
    .line 1601
    .line 1602
    .line 1603
    .line 1604
    .line 1605
    .line 1606
    .line 1607
    .line 1608
    .line 1609
    .line 1610
    .line 1611
    .line 1612
    .line 1613
    .line 1614
    .line 1615
    .line 1616
    .line 1617
    .line 1618
    .line 1619
    .line 1620
    .line 1621
    .line 1622
    .line 1623
    .line 1624
    .line 1625
    .line 1626
    .line 1627
    .line 1628
    .line 1629
    .line 1630
    .line 1631
    .line 1632
    .line 1633
    .line 1634
    .line 1635
    .line 1636
    .line 1637
    .line 1638
    .line 1639
    .line 1640
    .line 1641
    .line 1642
    .line 1643
    .line 1644
    .line 1645
    .line 1646
    .line 1647
    .line 1648
    .line 1649
    .line 1650
    .line 1651
    .line 1652
    .line 1653
    .line 1654
    .line 1655
    .line 1656
    .line 1657
    .line 1658
    .line 1659
    .line 1660
    .line 1661
    .line 1662
    .line 1663
    .line 1664
    .line 1665
    .line 1666
    .line 1667
    .line 1668
    .line 1669
    .line 1670
    .line 1671
    .line 1672
    .line 1673
    .line 1674
    .line 1675
    .line 1676
    .line 1677
    .line 1678
    .line 1679
    .line 1680
    .line 1681
    .line 1682
    .line 1683
    .line 1684
    .line 1685
    .line 1686
    .line 1687
    .line 1688
    .line 1689
    .line 1690
    .line 1691
    .line 1692
    .line 1693
    .line 1694
    .line 1695
    .line 1696
    .line 1697
    .line 1698
    .line 1699
    .line 1700
    .line 1701
    .line 1702
    .line 1703
    .line 1704
    .line 1705
    .line 1706
    .line 1707
    .line 1708
    .line 1709
    .line 1710
    .line 1711
    .line 1712
    .line 1713
    .line 1714
    .line 1715
    .line 1716
    .line 1717
    .line 1718
    .line 1719
    .line 1720
    .line 1721
    .line 1722
    .line 1723
    .line 1724
    .line 1725
    .line 1726
    .line 1727
    .line 1728
    .line 1729
    .line 1730
    .line 1731
    .line 1732
    .line 1733
    .line 1734
    .line 1735
    .line 1736
    .line 1737
    .line 1738
    .line 1739
    .line 1740
    .line 1741
    .line 1742
    .line 1743
    .line 1744
    .line 1745
    .line 1746
    .line 1747
    .line 1748
    .line 1749
    .line 1750
    .line 1751
    .line 1752
    .line 1753
    .line 1754
    .line 1755
    .line 1756
    .line 1757
    .line 1758
    .line 1759
    .line 1760
    .line 1761
    .line 1762
    .line 1763
    .line 1764
    .line 1765
    .line 1766
    .line 1767
    .line 1768
    .line 1769
    .line 1770
    .line 1771
    .line 1772
    .line 1773
    .line 1774
    .line 1775
    .line 1776
    .line 1777
    .line 1778
    .line 1779
    .line 1780
    .line 1781
    .line 1782
    .line 1783
    .line 1784
    .line 1785
    .line 1786
    .line 1787
    .line 1788
    .line 1789
    .line 1790
    .line 1791
    .line 1792
    .line 1793
    .line 1794
    .line 1795
    .line 1796
    .line 1797
    .line 1798
    .line 1799
    .line 1800
    .line 1801
    .line 1802
    .line 1803
    .line 1804
    .line 1805
    .line 1806
    .line 1807
    .line 1808
    .line 1809
    .line 1810
    .line 1811
    .line 1812
    .line 1813
    .line 1814
    .line 1815
    .line 1816
    .line 1817
    .line 1818
    .line 1819
    .line 1820
    .line 1821
    .line 1822
    .line 1823
    .line 1824
    .line 1825
    .line 1826
    .line 1827
    .line 1828
    .line 1829
    .line 1830
    .line 1831
    .line 1832
    .line 1833
    .line 1834
    .line 1835
    .line 1836
    .line 1837
    .line 1838
    .line 1839
    .line 1840
    .line 1841
    .line 1842
    .line 1843
    .line 1844
    .line 1845
    .line 1846
    .line 1847
    .line 1848
    .line 1849
    .line 1850
    .line 1851
    .line 1852
    .line 1853
    .line 1854
    .line 1855
    .line 1856
    .line 1857
    .line 1858
    .line 1859
    .line 1860
    .line 1861
    .line 1862
    .line 1863
    .line 1864
    .line 1865
    .line 1866
    .line 1867
    .line 1868
    .line 1869
    .line 1870
    .line 1871
    .line 1872
    .line 1873
    .line 1874
    .line 1875
    .line 1876
    .line 1877
    .line 1878
    .line 1879
    .line 1880
    .line 1881
    .line 1882
    .line 1883
    .line 1884
    .line 1885
    .line 1886
    .line 1887
    .line 1888
    .line 1889
    .line 1890
    .line 1891
    .line 1892
    .line 1893
    .line 1894
    .line 1895
    .line 1896
    .line 1897
    .line 1898
    .line 1899
    .line 1900
    .line 1901
    .line 1902
    .line 1903
    .line 1904
    .line 1905
    .line 1906
    .line 1907
    .line 1908
    .line 1909
    .line 1910
    .line 1911
    .line 1912
    .line 1913
    .line 1914
    .line 1915
    .line 1916
    .line 1917
    .line 1918
    .line 1919
    .line 1920
    .line 1921
    .line 1922
    .line 1923
    .line 1924
    .line 1925
    .line 1926
    .line 1927
    .line 1928
    .line 1929
    .line 1930
    .line 1931
    .line 1932
    .line 1933
    .line 1934
    .line 1935
    .line 1936
    .line 1937
    .line 1938
    .line 1939
    .line 1940
    .line 1941
    .line 1942
    .line 1943
    .line 1944
    .line 1945
    .line 1946
    .line 1947
    .line 1948
    .line 1949
    .line 1950
    .line 1951
    .line 1952
    .line 1953
    .line 1954
    .line 1955
    .line 1956
    .line 1957
    .line 1958
    .line 1959
    .line 1960
    .line 1961
    .line 1962
    .line 1963
    .line 1964
    .line 1965
    .line 1966
    .line 1967
    .line 1968
    .line 1969
    .line 1970
    .line 1971
    .line 1972
    .line 1973
    .line 1974
    .line 1975
    .line 1976
    .line 1977
    .line 1978
    .line 1979
    .line 1980
    .line 1981
    .line 1982
    .line 1983
    .line 1984
    .line 1985
    .line 1986
    .line 1987
    .line 1988
    .line 1989
    .line 1990
    .line 1991
    .line 1992
    .line 1993
    .line 1994
    .line 1995
    .line 1996
    .line 1997
    .line 1998
    .line 1999
    .line 2000
    .line 2001
    .line 2002
    .line 2003
    .line 2004
    .line 2005
    .line 2006
    .line 2007
    .line 2008
    .line 2009
    .line 2010
    .line 2011
    .line 2012
    .line 2013
    .line 2014
    .line 2015
    .line 2016
    .line 2017
    .line 2018
    .line 2019
    .line 2020
    .line 2021
    .line 2022
    .line 2023
    .line 2024
    .line 2025
    .line 2026
    .line 2027
    .line 2028
    .line 2029
    .line 2030
    .line 2031
    .line 2032
    .line 2033
    .line 2034
    .line 2035
    .line 2036
    .line 2037
    .line 2038
    .line 2039
    .line 2040
    .line 2041
    .line 2042
    .line 2043
    .line 2044
    .line 2045
    .line 2046
    .line 2047
    .line 2048
    .line 2049
    .line 2050
    .line 2051
    .line 2052
    .line 2053
    .line 2054
    .line 2055
    .line 2056
    .line 2057
    .line 2058
    .line 2059
    .line 2060
    .line 2061
    .line 2062
    .line 2063
    .line 2064
    .line 2065
    .line 2066
    .line 2067
    .line 2068
    .line 2069
    .line 2070
    .line 2071
    .line 2072
    .line 2073
    .line 2074
    .line 2075
    .line 2076
    .line 2077
    .line 2078
    .line 2079
    .line 2080
    .line 2081
    .line 2082
    .line 2083
    .line 2084
    .line 2085
    .line 2086
    .line 2087
    .line 2088
    .line 2089
    .line 2090
    .line 2091
    .line 2092
    .line 2093
    .line 2094
    .line 2095
    .line 2096
    .line 2097
    .line 2098
    .line 2099
    .line 2100
    .line 2101
    .line 2102
    .line 2103
    .line 2104
    .line 2105
    .line 2106
    .line 2107
    .line 2108
    .line 2109
    .line 2110
    .line 2111
    .line 2112
    .line 2113
    .line 2114
    .line 2115
    .line 2116
    .line 2117
    .line 2118
    .line 2119
    .line 2120
    .line 2121
    .line 2122
    .line 2123
    .line 2124
    .line 2125
    .line 2126
    .line 2127
    .line 2128
    .line 2129
    .line 2130
    .line 2131
    .line 2132
    .line 2133
    .line 2134
    .line 2135
    .line 2136
    .line 2137
    .line 2138
    .line 2139
    .line 2140
    .line 2141
    .line 2142
    .line 2143
    .line 2144
    .line 2145
    .line 2146
    .line 2147
    .line 2148
    .line 2149
    .line 2150
    .line 2151
    .line 2152
    .line 2153
    .line 2154
    .line 2155
    .line 2156
    .line 2157
    .line 2158
    .line 2159
    .line 2160
    .line 2161
    .line 2162
    .line 2163
    .line 2164
    .line 2165
    .line 2166
    .line 2167
    .line 2168
    .line 2169
    .line 2170
    .line 2171
    .line 2172
    .line 2173
    .line 2174
    .line 2175
    .line 2176
    .line 2177
    .line 2178
    .line 2179
    .line 2180
    .line 2181
    .line 2182
    .line 2183
    .line 2184
    .line 2185
    .line 2186
    .line 2187
    .line 2188
    .line 2189
    .line 2190
    .line 2191
    .line 2192
    .line 2193
    .line 2194
    .line 2195
    .line 2196
    .line 2197
    .line 2198
    .line 2199
    .line 2200
    .line 2201
    .line 2202
    .line 2203
    .line 2204
    .line 2205
    .line 2206
    .line 2207
    .line 2208
    .line 2209
    .line 2210
    .line 2211
    .line 2212
    .line 2213
    .line 2214
    .line 2215
    .line 2216
    .line 2217
    .line 2218
    .line 2219
    .line 2220
    .line 2221
    .line 2222
    .line 2223
    .line 2224
    .line 2225
    .line 2226
    .line 2227
    .line 2228
    .line 2229
    .line 2230
    .line 2231
    .line 2232
    .line 2233
    .line 2234
    .line 2235
    .line 2236
    .line 2237
    .line 2238
    .line 2239
    .line 2240
    .line 2241
    .line 2242
    .line 2243
    .line 2244
    .line 2245
    .line 2246
    .line 2247
    .line 2248
    .line 2249
    .line 2250
    .line 2251
    .line 2252
    .line 2253
    .line 2254
    .line 2255
    .line 2256
    .line 2257
    .line 2258
    .line 2259
    .line 2260
    .line 2261
    .line 2262
    .line 2263
    .line 2264
    .line 2265
    .line 2266
    .line 2267
    .line 2268
    .line 2269
    .line 2270
    .line 2271
    .line 2272
    .line 2273
    .line 2274
    .line 2275
    .line 2276
    .line 2277
    .line 2278
    .line 2279
    .line 2280
    .line 2281
    .line 2282
    .line 2283
    .line 2284
    .line 2285
    .line 2286
    .line 2287
    .line 2288
    .line 2289
    .line 2290
    .line 2291
    .line 2292
    .line 2293
    .line 2294
    .line 2295
    .line 2296
    .line 2297
    .line 2298
    .line 2299
    .line 2300
    .line 2301
    .line 2302
    .line 2303
    .line 2304
    .line 2305
    .line 2306
    .line 2307
    .line 2308
    .line 2309
    .line 2310
    .line 2311
    .line 2312
    .line 2313
    .line 2314
    .line 2315
    .line 2316
    .line 2317
    .line 2318
    .line 2319
    .line 2320
    .line 2321
    .line 2322
    .line 2323
    .line 2324
    .line 2325
    .line 2326
    .line 2327
    .line 2328
    .line 2329
    .line 2330
    .line 2331
    .line 2332
    .line 2333
    .line 2334
    .line 2335
    .line 2336
    .line 2337
    .line 2338
    .line 2339
    .line 2340
    .line 2341
    .line 2342
    .line 2343
    .line 2344
    .line 2345
    .line 2346
    .line 2347
    .line 2348
    .line 2349
    .line 2350
    .line 2351
    .line 2352
    .line 2353
    .line 2354
    .line 2355
    .line 2356
    .line 2357
    .line 2358
    .line 2359
    .line 2360
    .line 2361
    .line 2362
    .line 2363
    .line 2364
    .line 2365
    .line 2366
    .line 2367
    .line 2368
    .line 2369
    .line 2370
    .line 2371
    .line 2372
    .line 2373
    .line 2374
    .line 2375
    .line 2376
    .line 2377
    .line 2378
    .line 2379
    .line 2380
    .line 2381
    .line 2382
    .line 2383
    .line 2384
    .line 2385
    .line 2386
    .line 2387
    .line 2388
    .line 2389
    .line 2390
    .line 2391
    .line 2392
    .line 2393
    .line 2394
    .line 2395
    .line 2396
    .line 2397
    .line 2398
    .line 2399
    .line 2400
    .line 2401
    .line 2402
    .line 2403
    .line 2404
    .line 2405
    .line 2406
    .line 2407
    .line 2408
    .line 2409
    .line 2410
    .line 2411
    .line 2412
    .line 2413
    .line 2414
    .line 2415
    .line 2416
    .line 2417
    .line 2418
    .line 2419
    .line 2420
    .line 2421
    .line 2422
    .line 2423
    .line 2424
    .line 2425
    .line 2426
    .line 2427
    .line 2428
    .line 2429
    .line 2430
    .line 2431
    .line 2432
    .line 2433
    .line 2434
    .line 2435
    .line 2436
    .line 2437
    .line 2438
    .line 2439
    .line 2440
    .line 2441
    .line 2442
    .line 2443
    .line 2444
    .line 2445
    .line 2446
    .line 2447
    .line 2448
    .line 2449
    .line 2450
    .line 2451
    .line 2452
    .line 2453
    .line 2454
    .line 2455
    .line 2456
    .line 2457
    .line 2458
    .line 2459
    .line 2460
    .line 2461
    .line 2462
    .line 2463
    .line 2464
    .line 2465
    .line 2466
    .line 2467
    .line 2468
    .line 2469
    .line 2470
    .line 2471
    .line 2472
    .line 2473
    .line 2474
    .line 2475
    .line 2476
    .line 2477
    .line 2478
    .line 2479
    .line 2480
    .line 2481
    .line 2482
    .line 2483
    .line 2484
    .line 2485
    .line 2486
    .line 2487
    .line 2488
    .line 2489
    .line 2490
    .line 2491
    .line 2492
    .line 2493
    .line 2494
    .line 2495
    .line 2496
    .line 2497
    .line 2498
.end method
