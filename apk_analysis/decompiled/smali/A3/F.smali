.class public final LA3/F;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LA3/B;


# instance fields
.field public final synthetic a:I

.field public b:I

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;

.field public f:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    .line 1
    iput p1, p0, LA3/F;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(LA3/G;I)V
    .locals 2

    const/4 v0, 0x0

    iput v0, p0, LA3/F;->a:I

    .line 63
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LA3/F;->f:Ljava/lang/Object;

    .line 64
    new-instance p1, LZ3/f;

    const/4 v0, 0x5

    new-array v1, v0, [B

    .line 65
    invoke-direct {p1, v0, v1}, LZ3/f;-><init>(I[B)V

    .line 66
    iput-object p1, p0, LA3/F;->c:Ljava/lang/Object;

    .line 67
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, LA3/F;->d:Ljava/lang/Object;

    .line 68
    new-instance p1, Landroid/util/SparseIntArray;

    invoke-direct {p1}, Landroid/util/SparseIntArray;-><init>()V

    iput-object p1, p0, LA3/F;->e:Ljava/lang/Object;

    .line 69
    iput p2, p0, LA3/F;->b:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 13

    const/4 v0, 0x4

    iput v0, p0, LA3/F;->a:I

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    invoke-static {}, Landroid/opengl/GLES20;->glCreateProgram()I

    move-result v0

    iput v0, p0, LA3/F;->b:I

    .line 9
    invoke-static {}, Ll4/a;->i()V

    const v1, 0x8b31

    .line 10
    invoke-static {p1, v0, v1}, LA3/F;->a(Ljava/lang/String;II)V

    const p1, 0x8b30

    .line 11
    invoke-static {p2, v0, p1}, LA3/F;->a(Ljava/lang/String;II)V

    .line 12
    invoke-static {v0}, Landroid/opengl/GLES20;->glLinkProgram(I)V

    const/4 p1, 0x0

    .line 13
    filled-new-array {p1}, [I

    move-result-object p2

    const v1, 0x8b82

    .line 14
    invoke-static {v0, v1, p2, p1}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    .line 15
    aget p2, p2, p1

    const/4 v1, 0x1

    if-ne p2, v1, :cond_0

    move p2, v1

    goto :goto_0

    :cond_0
    move p2, p1

    :goto_0
    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Unable to link shader program: \n"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 16
    invoke-static {v0}, Landroid/opengl/GLES20;->glGetProgramInfoLog(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    .line 17
    invoke-static {v2, p2}, Ll4/a;->j(Ljava/lang/String;Z)V

    .line 18
    invoke-static {v0}, Landroid/opengl/GLES20;->glUseProgram(I)V

    .line 19
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, LA3/F;->e:Ljava/lang/Object;

    .line 20
    new-array p2, v1, [I

    const v2, 0x8b89

    .line 21
    invoke-static {v0, v2, p2, p1}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    .line 22
    aget v0, p2, p1

    new-array v0, v0, [Ld0/w;

    iput-object v0, p0, LA3/F;->c:Ljava/lang/Object;

    move v3, p1

    .line 23
    :goto_1
    aget v0, p2, p1

    if-ge v3, v0, :cond_3

    .line 24
    iget v2, p0, LA3/F;->b:I

    .line 25
    new-array v0, v1, [I

    const v4, 0x8b8a

    .line 26
    invoke-static {v2, v4, v0, p1}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    .line 27
    aget v4, v0, p1

    new-array v11, v4, [B

    .line 28
    new-array v5, v1, [I

    new-array v7, v1, [I

    new-array v9, v1, [I

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    invoke-static/range {v2 .. v12}, Landroid/opengl/GLES20;->glGetActiveAttrib(III[II[II[II[BI)V

    .line 29
    new-instance v0, Ljava/lang/String;

    move v5, p1

    :goto_2
    if-ge v5, v4, :cond_2

    .line 30
    aget-byte v6, v11, v5

    if-nez v6, :cond_1

    move v4, v5

    goto :goto_3

    :cond_1
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    .line 31
    :cond_2
    :goto_3
    invoke-direct {v0, v11, p1, v4}, Ljava/lang/String;-><init>([BII)V

    .line 32
    invoke-static {v2, v0}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    .line 33
    new-instance v2, Ld0/w;

    const/4 v4, 0x7

    .line 34
    invoke-direct {v2, v4}, Ld0/w;-><init>(I)V

    .line 35
    iget-object v4, p0, LA3/F;->c:Ljava/lang/Object;

    check-cast v4, [Ld0/w;

    aput-object v2, v4, v3

    .line 36
    iget-object v4, p0, LA3/F;->e:Ljava/lang/Object;

    check-cast v4, Ljava/util/HashMap;

    invoke-virtual {v4, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    .line 37
    :cond_3
    new-instance p2, Ljava/util/HashMap;

    invoke-direct {p2}, Ljava/util/HashMap;-><init>()V

    iput-object p2, p0, LA3/F;->f:Ljava/lang/Object;

    .line 38
    new-array p2, v1, [I

    .line 39
    iget v0, p0, LA3/F;->b:I

    const v2, 0x8b86

    invoke-static {v0, v2, p2, p1}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    .line 40
    aget v0, p2, p1

    new-array v0, v0, [Le0/c;

    iput-object v0, p0, LA3/F;->d:Ljava/lang/Object;

    move v3, p1

    .line 41
    :goto_4
    aget v0, p2, p1

    if-ge v3, v0, :cond_6

    .line 42
    iget v2, p0, LA3/F;->b:I

    .line 43
    new-array v0, v1, [I

    const v4, 0x8b87

    .line 44
    invoke-static {v2, v4, v0, p1}, Landroid/opengl/GLES20;->glGetProgramiv(II[II)V

    .line 45
    new-array v9, v1, [I

    .line 46
    aget v4, v0, p1

    new-array v11, v4, [B

    .line 47
    new-array v5, v1, [I

    new-array v7, v1, [I

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    invoke-static/range {v2 .. v12}, Landroid/opengl/GLES20;->glGetActiveUniform(III[II[II[II[BI)V

    .line 48
    new-instance v0, Ljava/lang/String;

    move v5, p1

    :goto_5
    if-ge v5, v4, :cond_5

    .line 49
    aget-byte v6, v11, v5

    if-nez v6, :cond_4

    move v4, v5

    goto :goto_6

    :cond_4
    add-int/lit8 v5, v5, 0x1

    goto :goto_5

    .line 50
    :cond_5
    :goto_6
    invoke-direct {v0, v11, p1, v4}, Ljava/lang/String;-><init>([BII)V

    .line 51
    invoke-static {v2, v0}, Landroid/opengl/GLES20;->glGetUniformLocation(ILjava/lang/String;)I

    .line 52
    new-instance v2, Le0/c;

    const/4 v4, 0x7

    .line 53
    invoke-direct {v2, v4}, Le0/c;-><init>(I)V

    .line 54
    iget-object v4, p0, LA3/F;->d:Ljava/lang/Object;

    check-cast v4, [Le0/c;

    aput-object v2, v4, v3

    .line 55
    iget-object v4, p0, LA3/F;->f:Ljava/lang/Object;

    check-cast v4, Ljava/util/HashMap;

    invoke-virtual {v4, v0, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    .line 56
    :cond_6
    invoke-static {}, Ll4/a;->i()V

    return-void
.end method

.method public constructor <init>(Ll3/I;Lq3/w;[B[LH1/k;I)V
    .locals 1

    const/4 v0, 0x5

    iput v0, p0, LA3/F;->a:I

    .line 57
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 58
    iput-object p1, p0, LA3/F;->c:Ljava/lang/Object;

    .line 59
    iput-object p2, p0, LA3/F;->d:Ljava/lang/Object;

    .line 60
    iput-object p3, p0, LA3/F;->e:Ljava/lang/Object;

    .line 61
    iput-object p4, p0, LA3/F;->f:Ljava/lang/Object;

    .line 62
    iput p5, p0, LA3/F;->b:I

    return-void
.end method

.method public constructor <init>(Lo1/f;)V
    .locals 1

    const/4 v0, 0x2

    iput v0, p0, LA3/F;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 3
    iput v0, p0, LA3/F;->b:I

    .line 4
    iput-object p1, p0, LA3/F;->c:Ljava/lang/Object;

    .line 5
    new-instance p1, LF0/h;

    invoke-direct {p1, v0}, LF0/h;-><init>(I)V

    iput-object p1, p0, LA3/F;->d:Ljava/lang/Object;

    .line 6
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, LA3/F;->e:Ljava/lang/Object;

    return-void
.end method

.method public static a(Ljava/lang/String;II)V
    .locals 3

    .line 1
    invoke-static {p2}, Landroid/opengl/GLES20;->glCreateShader(I)I

    .line 2
    .line 3
    .line 4
    move-result p2

    .line 5
    invoke-static {p2, p0}, Landroid/opengl/GLES20;->glShaderSource(ILjava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {p2}, Landroid/opengl/GLES20;->glCompileShader(I)V

    .line 9
    .line 10
    .line 11
    const/4 v0, 0x0

    .line 12
    filled-new-array {v0}, [I

    .line 13
    .line 14
    .line 15
    move-result-object v1

    .line 16
    const v2, 0x8b81

    .line 17
    .line 18
    .line 19
    invoke-static {p2, v2, v1, v0}, Landroid/opengl/GLES20;->glGetShaderiv(II[II)V

    .line 20
    .line 21
    .line 22
    aget v1, v1, v0

    .line 23
    .line 24
    const/4 v2, 0x1

    .line 25
    if-ne v1, v2, :cond_0

    .line 26
    .line 27
    move v0, v2

    .line 28
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    invoke-static {p2}, Landroid/opengl/GLES20;->glGetShaderInfoLog(I)Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v2

    .line 37
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    const-string v2, ", source: "

    .line 41
    .line 42
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 49
    .line 50
    .line 51
    move-result-object p0

    .line 52
    invoke-static {p0, v0}, Ll4/a;->j(Ljava/lang/String;Z)V

    .line 53
    .line 54
    .line 55
    invoke-static {p1, p2}, Landroid/opengl/GLES20;->glAttachShader(II)V

    .line 56
    .line 57
    .line 58
    invoke-static {p2}, Landroid/opengl/GLES20;->glDeleteShader(I)V

    .line 59
    .line 60
    .line 61
    invoke-static {}, Ll4/a;->i()V

    .line 62
    .line 63
    .line 64
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


# virtual methods
.method public b(Ll4/x;Lq3/l;LA3/I;)V
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

.method public c(LA4/r;)V
    .locals 28

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    invoke-virtual {v1}, LA4/r;->x()I

    .line 6
    .line 7
    .line 8
    move-result v2

    .line 9
    const/4 v3, 0x2

    .line 10
    if-eq v2, v3, :cond_0

    .line 11
    .line 12
    goto/16 :goto_14

    .line 13
    .line 14
    :cond_0
    iget-object v2, v0, LA3/F;->f:Ljava/lang/Object;

    .line 15
    .line 16
    check-cast v2, LA3/G;

    .line 17
    .line 18
    iget v4, v2, LA3/G;->a:I

    .line 19
    .line 20
    const/4 v5, 0x1

    .line 21
    const/4 v6, 0x0

    .line 22
    iget-object v7, v2, LA3/G;->b:Ljava/util/List;

    .line 23
    .line 24
    if-eq v4, v5, :cond_2

    .line 25
    .line 26
    if-eq v4, v3, :cond_2

    .line 27
    .line 28
    iget v4, v2, LA3/G;->l:I

    .line 29
    .line 30
    if-ne v4, v5, :cond_1

    .line 31
    .line 32
    goto :goto_0

    .line 33
    :cond_1
    new-instance v4, Ll4/x;

    .line 34
    .line 35
    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 36
    .line 37
    .line 38
    move-result-object v8

    .line 39
    check-cast v8, Ll4/x;

    .line 40
    .line 41
    invoke-virtual {v8}, Ll4/x;->c()J

    .line 42
    .line 43
    .line 44
    move-result-wide v8

    .line 45
    invoke-direct {v4, v8, v9}, Ll4/x;-><init>(J)V

    .line 46
    .line 47
    .line 48
    invoke-interface {v7, v4}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :cond_2
    :goto_0
    invoke-interface {v7, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 53
    .line 54
    .line 55
    move-result-object v4

    .line 56
    check-cast v4, Ll4/x;

    .line 57
    .line 58
    :goto_1
    invoke-virtual {v1}, LA4/r;->x()I

    .line 59
    .line 60
    .line 61
    move-result v7

    .line 62
    and-int/lit16 v7, v7, 0x80

    .line 63
    .line 64
    if-nez v7, :cond_3

    .line 65
    .line 66
    goto/16 :goto_14

    .line 67
    .line 68
    :cond_3
    invoke-virtual {v1, v5}, LA4/r;->I(I)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1}, LA4/r;->C()I

    .line 72
    .line 73
    .line 74
    move-result v7

    .line 75
    const/4 v8, 0x3

    .line 76
    invoke-virtual {v1, v8}, LA4/r;->I(I)V

    .line 77
    .line 78
    .line 79
    iget-object v9, v0, LA3/F;->c:Ljava/lang/Object;

    .line 80
    .line 81
    check-cast v9, LZ3/f;

    .line 82
    .line 83
    iget-object v10, v9, LZ3/f;->b:[B

    .line 84
    .line 85
    invoke-virtual {v1, v10, v6, v3}, LA4/r;->h([BII)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v9, v6}, LZ3/f;->o(I)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v9, v8}, LZ3/f;->r(I)V

    .line 92
    .line 93
    .line 94
    const/16 v10, 0xd

    .line 95
    .line 96
    invoke-virtual {v9, v10}, LZ3/f;->i(I)I

    .line 97
    .line 98
    .line 99
    move-result v11

    .line 100
    iput v11, v2, LA3/G;->r:I

    .line 101
    .line 102
    iget-object v11, v9, LZ3/f;->b:[B

    .line 103
    .line 104
    invoke-virtual {v1, v11, v6, v3}, LA4/r;->h([BII)V

    .line 105
    .line 106
    .line 107
    invoke-virtual {v9, v6}, LZ3/f;->o(I)V

    .line 108
    .line 109
    .line 110
    const/4 v11, 0x4

    .line 111
    invoke-virtual {v9, v11}, LZ3/f;->r(I)V

    .line 112
    .line 113
    .line 114
    const/16 v12, 0xc

    .line 115
    .line 116
    invoke-virtual {v9, v12}, LZ3/f;->i(I)I

    .line 117
    .line 118
    .line 119
    move-result v13

    .line 120
    invoke-virtual {v1, v13}, LA4/r;->I(I)V

    .line 121
    .line 122
    .line 123
    iget-object v13, v2, LA3/G;->e:LA3/f;

    .line 124
    .line 125
    iget v14, v2, LA3/G;->a:I

    .line 126
    .line 127
    const/16 v15, 0x2000

    .line 128
    .line 129
    const/4 v5, 0x0

    .line 130
    const/16 v12, 0x15

    .line 131
    .line 132
    if-ne v14, v3, :cond_4

    .line 133
    .line 134
    iget-object v3, v2, LA3/G;->p:LA3/J;

    .line 135
    .line 136
    if-nez v3, :cond_4

    .line 137
    .line 138
    new-instance v3, Landroid/support/v4/media/session/y;

    .line 139
    .line 140
    sget-object v11, Ll4/y;->f:[B

    .line 141
    .line 142
    invoke-direct {v3, v12, v5, v5, v11}, Landroid/support/v4/media/session/y;-><init>(ILjava/lang/String;Ljava/util/ArrayList;[B)V

    .line 143
    .line 144
    .line 145
    invoke-virtual {v13, v12, v3}, LA3/f;->a(ILandroid/support/v4/media/session/y;)LA3/J;

    .line 146
    .line 147
    .line 148
    move-result-object v3

    .line 149
    iput-object v3, v2, LA3/G;->p:LA3/J;

    .line 150
    .line 151
    if-eqz v3, :cond_4

    .line 152
    .line 153
    iget-object v11, v2, LA3/G;->k:Lq3/l;

    .line 154
    .line 155
    new-instance v5, LA3/I;

    .line 156
    .line 157
    invoke-direct {v5, v7, v12, v15}, LA3/I;-><init>(III)V

    .line 158
    .line 159
    .line 160
    invoke-interface {v3, v4, v11, v5}, LA3/J;->b(Ll4/x;Lq3/l;LA3/I;)V

    .line 161
    .line 162
    .line 163
    :cond_4
    iget-object v3, v0, LA3/F;->d:Ljava/lang/Object;

    .line 164
    .line 165
    check-cast v3, Landroid/util/SparseArray;

    .line 166
    .line 167
    invoke-virtual {v3}, Landroid/util/SparseArray;->clear()V

    .line 168
    .line 169
    .line 170
    iget-object v5, v0, LA3/F;->e:Ljava/lang/Object;

    .line 171
    .line 172
    check-cast v5, Landroid/util/SparseIntArray;

    .line 173
    .line 174
    invoke-virtual {v5}, Landroid/util/SparseIntArray;->clear()V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v1}, LA4/r;->e()I

    .line 178
    .line 179
    .line 180
    move-result v11

    .line 181
    :goto_2
    iget-object v15, v2, LA3/G;->g:Landroid/util/SparseBooleanArray;

    .line 182
    .line 183
    if-lez v11, :cond_1b

    .line 184
    .line 185
    iget-object v12, v9, LZ3/f;->b:[B

    .line 186
    .line 187
    const/4 v10, 0x5

    .line 188
    invoke-virtual {v1, v12, v6, v10}, LA4/r;->h([BII)V

    .line 189
    .line 190
    .line 191
    invoke-virtual {v9, v6}, LZ3/f;->o(I)V

    .line 192
    .line 193
    .line 194
    const/16 v12, 0x8

    .line 195
    .line 196
    invoke-virtual {v9, v12}, LZ3/f;->i(I)I

    .line 197
    .line 198
    .line 199
    move-result v12

    .line 200
    invoke-virtual {v9, v8}, LZ3/f;->r(I)V

    .line 201
    .line 202
    .line 203
    const/16 v6, 0xd

    .line 204
    .line 205
    invoke-virtual {v9, v6}, LZ3/f;->i(I)I

    .line 206
    .line 207
    .line 208
    move-result v8

    .line 209
    const/4 v6, 0x4

    .line 210
    invoke-virtual {v9, v6}, LZ3/f;->r(I)V

    .line 211
    .line 212
    .line 213
    const/16 v6, 0xc

    .line 214
    .line 215
    invoke-virtual {v9, v6}, LZ3/f;->i(I)I

    .line 216
    .line 217
    .line 218
    move-result v16

    .line 219
    iget v6, v1, LA4/r;->a:I

    .line 220
    .line 221
    add-int v10, v6, v16

    .line 222
    .line 223
    const/16 v18, -0x1

    .line 224
    .line 225
    move-object/from16 v20, v4

    .line 226
    .line 227
    move-object/from16 v19, v9

    .line 228
    .line 229
    move/from16 v9, v18

    .line 230
    .line 231
    const/4 v0, 0x0

    .line 232
    move/from16 v18, v11

    .line 233
    .line 234
    const/4 v11, 0x0

    .line 235
    :goto_3
    iget v4, v1, LA4/r;->a:I

    .line 236
    .line 237
    if-ge v4, v10, :cond_13

    .line 238
    .line 239
    invoke-virtual {v1}, LA4/r;->x()I

    .line 240
    .line 241
    .line 242
    move-result v4

    .line 243
    invoke-virtual {v1}, LA4/r;->x()I

    .line 244
    .line 245
    .line 246
    move-result v21

    .line 247
    move/from16 v22, v7

    .line 248
    .line 249
    iget v7, v1, LA4/r;->a:I

    .line 250
    .line 251
    add-int v7, v7, v21

    .line 252
    .line 253
    if-le v7, v10, :cond_5

    .line 254
    .line 255
    :goto_4
    move-object/from16 v25, v3

    .line 256
    .line 257
    const/4 v3, 0x4

    .line 258
    const/16 v17, 0x3

    .line 259
    .line 260
    goto/16 :goto_b

    .line 261
    .line 262
    :cond_5
    const/16 v21, 0xac

    .line 263
    .line 264
    const/16 v23, 0x87

    .line 265
    .line 266
    const/16 v24, 0x81

    .line 267
    .line 268
    move-object/from16 v25, v3

    .line 269
    .line 270
    const/4 v3, 0x5

    .line 271
    if-ne v4, v3, :cond_a

    .line 272
    .line 273
    invoke-virtual {v1}, LA4/r;->y()J

    .line 274
    .line 275
    .line 276
    move-result-wide v3

    .line 277
    const-wide/32 v26, 0x41432d33

    .line 278
    .line 279
    .line 280
    cmp-long v26, v3, v26

    .line 281
    .line 282
    if-nez v26, :cond_6

    .line 283
    .line 284
    move/from16 v9, v24

    .line 285
    .line 286
    goto :goto_6

    .line 287
    :cond_6
    const-wide/32 v26, 0x45414333

    .line 288
    .line 289
    .line 290
    cmp-long v24, v3, v26

    .line 291
    .line 292
    if-nez v24, :cond_7

    .line 293
    .line 294
    move/from16 v9, v23

    .line 295
    .line 296
    goto :goto_6

    .line 297
    :cond_7
    const-wide/32 v23, 0x41432d34

    .line 298
    .line 299
    .line 300
    cmp-long v23, v3, v23

    .line 301
    .line 302
    if-nez v23, :cond_8

    .line 303
    .line 304
    :goto_5
    move/from16 v9, v21

    .line 305
    .line 306
    goto :goto_6

    .line 307
    :cond_8
    const-wide/32 v23, 0x48455643

    .line 308
    .line 309
    .line 310
    cmp-long v3, v3, v23

    .line 311
    .line 312
    if-nez v3, :cond_9

    .line 313
    .line 314
    const/16 v9, 0x24

    .line 315
    .line 316
    :cond_9
    :goto_6
    move/from16 v21, v7

    .line 317
    .line 318
    :goto_7
    const/4 v3, 0x4

    .line 319
    :goto_8
    const/16 v17, 0x3

    .line 320
    .line 321
    goto/16 :goto_a

    .line 322
    .line 323
    :cond_a
    const/16 v3, 0x6a

    .line 324
    .line 325
    if-ne v4, v3, :cond_b

    .line 326
    .line 327
    move/from16 v21, v7

    .line 328
    .line 329
    move/from16 v9, v24

    .line 330
    .line 331
    goto :goto_7

    .line 332
    :cond_b
    const/16 v3, 0x7a

    .line 333
    .line 334
    if-ne v4, v3, :cond_c

    .line 335
    .line 336
    move/from16 v21, v7

    .line 337
    .line 338
    move/from16 v9, v23

    .line 339
    .line 340
    goto :goto_7

    .line 341
    :cond_c
    const/16 v3, 0x7f

    .line 342
    .line 343
    if-ne v4, v3, :cond_d

    .line 344
    .line 345
    invoke-virtual {v1}, LA4/r;->x()I

    .line 346
    .line 347
    .line 348
    move-result v3

    .line 349
    const/16 v4, 0x15

    .line 350
    .line 351
    if-ne v3, v4, :cond_9

    .line 352
    .line 353
    goto :goto_5

    .line 354
    :cond_d
    const/16 v3, 0x7b

    .line 355
    .line 356
    if-ne v4, v3, :cond_e

    .line 357
    .line 358
    const/16 v3, 0x8a

    .line 359
    .line 360
    move v9, v3

    .line 361
    goto :goto_6

    .line 362
    :cond_e
    const/16 v3, 0xa

    .line 363
    .line 364
    if-ne v4, v3, :cond_f

    .line 365
    .line 366
    sget-object v3, LO5/e;->c:Ljava/nio/charset/Charset;

    .line 367
    .line 368
    const/4 v4, 0x3

    .line 369
    invoke-virtual {v1, v4, v3}, LA4/r;->v(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 370
    .line 371
    .line 372
    move-result-object v3

    .line 373
    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 374
    .line 375
    .line 376
    move-result-object v11

    .line 377
    goto :goto_6

    .line 378
    :cond_f
    const/16 v3, 0x59

    .line 379
    .line 380
    if-ne v4, v3, :cond_11

    .line 381
    .line 382
    new-instance v0, Ljava/util/ArrayList;

    .line 383
    .line 384
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 385
    .line 386
    .line 387
    :goto_9
    iget v4, v1, LA4/r;->a:I

    .line 388
    .line 389
    if-ge v4, v7, :cond_10

    .line 390
    .line 391
    sget-object v4, LO5/e;->c:Ljava/nio/charset/Charset;

    .line 392
    .line 393
    const/4 v9, 0x3

    .line 394
    invoke-virtual {v1, v9, v4}, LA4/r;->v(ILjava/nio/charset/Charset;)Ljava/lang/String;

    .line 395
    .line 396
    .line 397
    move-result-object v4

    .line 398
    invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 399
    .line 400
    .line 401
    move-result-object v4

    .line 402
    invoke-virtual {v1}, LA4/r;->x()I

    .line 403
    .line 404
    .line 405
    const/4 v3, 0x4

    .line 406
    new-array v9, v3, [B

    .line 407
    .line 408
    move/from16 v21, v7

    .line 409
    .line 410
    const/4 v7, 0x0

    .line 411
    invoke-virtual {v1, v9, v7, v3}, LA4/r;->h([BII)V

    .line 412
    .line 413
    .line 414
    new-instance v7, LA3/H;

    .line 415
    .line 416
    invoke-direct {v7, v4, v9}, LA3/H;-><init>(Ljava/lang/String;[B)V

    .line 417
    .line 418
    .line 419
    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 420
    .line 421
    .line 422
    move/from16 v7, v21

    .line 423
    .line 424
    const/16 v3, 0x59

    .line 425
    .line 426
    goto :goto_9

    .line 427
    :cond_10
    move/from16 v21, v7

    .line 428
    .line 429
    const/4 v3, 0x4

    .line 430
    const/16 v9, 0x59

    .line 431
    .line 432
    goto :goto_8

    .line 433
    :cond_11
    move/from16 v21, v7

    .line 434
    .line 435
    const/4 v3, 0x4

    .line 436
    const/16 v17, 0x3

    .line 437
    .line 438
    const/16 v7, 0x6f

    .line 439
    .line 440
    if-ne v4, v7, :cond_12

    .line 441
    .line 442
    const/16 v4, 0x101

    .line 443
    .line 444
    move v9, v4

    .line 445
    :cond_12
    :goto_a
    iget v4, v1, LA4/r;->a:I

    .line 446
    .line 447
    sub-int v7, v21, v4

    .line 448
    .line 449
    invoke-virtual {v1, v7}, LA4/r;->I(I)V

    .line 450
    .line 451
    .line 452
    move/from16 v7, v22

    .line 453
    .line 454
    move-object/from16 v3, v25

    .line 455
    .line 456
    goto/16 :goto_3

    .line 457
    .line 458
    :cond_13
    move/from16 v22, v7

    .line 459
    .line 460
    goto/16 :goto_4

    .line 461
    .line 462
    :goto_b
    invoke-virtual {v1, v10}, LA4/r;->H(I)V

    .line 463
    .line 464
    .line 465
    new-instance v4, Landroid/support/v4/media/session/y;

    .line 466
    .line 467
    iget-object v7, v1, LA4/r;->c:Ljava/lang/Object;

    .line 468
    .line 469
    check-cast v7, [B

    .line 470
    .line 471
    invoke-static {v7, v6, v10}, Ljava/util/Arrays;->copyOfRange([BII)[B

    .line 472
    .line 473
    .line 474
    move-result-object v6

    .line 475
    invoke-direct {v4, v9, v11, v0, v6}, Landroid/support/v4/media/session/y;-><init>(ILjava/lang/String;Ljava/util/ArrayList;[B)V

    .line 476
    .line 477
    .line 478
    const/4 v0, 0x6

    .line 479
    if-eq v12, v0, :cond_14

    .line 480
    .line 481
    const/4 v0, 0x5

    .line 482
    if-ne v12, v0, :cond_15

    .line 483
    .line 484
    :cond_14
    move v12, v9

    .line 485
    :cond_15
    add-int/lit8 v16, v16, 0x5

    .line 486
    .line 487
    sub-int v11, v18, v16

    .line 488
    .line 489
    const/4 v0, 0x2

    .line 490
    if-ne v14, v0, :cond_16

    .line 491
    .line 492
    move v6, v12

    .line 493
    goto :goto_c

    .line 494
    :cond_16
    move v6, v8

    .line 495
    :goto_c
    invoke-virtual {v15, v6}, Landroid/util/SparseBooleanArray;->get(I)Z

    .line 496
    .line 497
    .line 498
    move-result v7

    .line 499
    if-eqz v7, :cond_17

    .line 500
    .line 501
    move-object/from16 v0, v25

    .line 502
    .line 503
    const/16 v7, 0x15

    .line 504
    .line 505
    goto :goto_f

    .line 506
    :cond_17
    const/16 v7, 0x15

    .line 507
    .line 508
    if-ne v14, v0, :cond_18

    .line 509
    .line 510
    if-ne v12, v7, :cond_18

    .line 511
    .line 512
    iget-object v4, v2, LA3/G;->p:LA3/J;

    .line 513
    .line 514
    goto :goto_d

    .line 515
    :cond_18
    invoke-virtual {v13, v12, v4}, LA3/f;->a(ILandroid/support/v4/media/session/y;)LA3/J;

    .line 516
    .line 517
    .line 518
    move-result-object v4

    .line 519
    :goto_d
    if-ne v14, v0, :cond_1a

    .line 520
    .line 521
    const/16 v0, 0x2000

    .line 522
    .line 523
    invoke-virtual {v5, v6, v0}, Landroid/util/SparseIntArray;->get(II)I

    .line 524
    .line 525
    .line 526
    move-result v9

    .line 527
    if-ge v8, v9, :cond_19

    .line 528
    .line 529
    goto :goto_e

    .line 530
    :cond_19
    move-object/from16 v0, v25

    .line 531
    .line 532
    goto :goto_f

    .line 533
    :cond_1a
    :goto_e
    invoke-virtual {v5, v6, v8}, Landroid/util/SparseIntArray;->put(II)V

    .line 534
    .line 535
    .line 536
    move-object/from16 v0, v25

    .line 537
    .line 538
    invoke-virtual {v0, v6, v4}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 539
    .line 540
    .line 541
    :goto_f
    move-object v3, v0

    .line 542
    move v12, v7

    .line 543
    move/from16 v8, v17

    .line 544
    .line 545
    move-object/from16 v9, v19

    .line 546
    .line 547
    move-object/from16 v4, v20

    .line 548
    .line 549
    move/from16 v7, v22

    .line 550
    .line 551
    const/4 v6, 0x0

    .line 552
    const/16 v10, 0xd

    .line 553
    .line 554
    move-object/from16 v0, p0

    .line 555
    .line 556
    goto/16 :goto_2

    .line 557
    .line 558
    :cond_1b
    move-object v0, v3

    .line 559
    move-object/from16 v20, v4

    .line 560
    .line 561
    move/from16 v22, v7

    .line 562
    .line 563
    invoke-virtual {v5}, Landroid/util/SparseIntArray;->size()I

    .line 564
    .line 565
    .line 566
    move-result v1

    .line 567
    const/4 v7, 0x0

    .line 568
    :goto_10
    iget-object v3, v2, LA3/G;->f:Landroid/util/SparseArray;

    .line 569
    .line 570
    if-ge v7, v1, :cond_1e

    .line 571
    .line 572
    invoke-virtual {v5, v7}, Landroid/util/SparseIntArray;->keyAt(I)I

    .line 573
    .line 574
    .line 575
    move-result v4

    .line 576
    invoke-virtual {v5, v7}, Landroid/util/SparseIntArray;->valueAt(I)I

    .line 577
    .line 578
    .line 579
    move-result v6

    .line 580
    const/4 v8, 0x1

    .line 581
    invoke-virtual {v15, v4, v8}, Landroid/util/SparseBooleanArray;->put(IZ)V

    .line 582
    .line 583
    .line 584
    iget-object v9, v2, LA3/G;->h:Landroid/util/SparseBooleanArray;

    .line 585
    .line 586
    invoke-virtual {v9, v6, v8}, Landroid/util/SparseBooleanArray;->put(IZ)V

    .line 587
    .line 588
    .line 589
    invoke-virtual {v0, v7}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    .line 590
    .line 591
    .line 592
    move-result-object v8

    .line 593
    check-cast v8, LA3/J;

    .line 594
    .line 595
    if-eqz v8, :cond_1d

    .line 596
    .line 597
    iget-object v9, v2, LA3/G;->p:LA3/J;

    .line 598
    .line 599
    if-eq v8, v9, :cond_1c

    .line 600
    .line 601
    iget-object v9, v2, LA3/G;->k:Lq3/l;

    .line 602
    .line 603
    new-instance v10, LA3/I;

    .line 604
    .line 605
    move/from16 v11, v22

    .line 606
    .line 607
    const/16 v12, 0x2000

    .line 608
    .line 609
    invoke-direct {v10, v11, v4, v12}, LA3/I;-><init>(III)V

    .line 610
    .line 611
    .line 612
    move-object/from16 v4, v20

    .line 613
    .line 614
    invoke-interface {v8, v4, v9, v10}, LA3/J;->b(Ll4/x;Lq3/l;LA3/I;)V

    .line 615
    .line 616
    .line 617
    goto :goto_11

    .line 618
    :cond_1c
    move-object/from16 v4, v20

    .line 619
    .line 620
    move/from16 v11, v22

    .line 621
    .line 622
    const/16 v12, 0x2000

    .line 623
    .line 624
    :goto_11
    invoke-virtual {v3, v6, v8}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    .line 625
    .line 626
    .line 627
    goto :goto_12

    .line 628
    :cond_1d
    move-object/from16 v4, v20

    .line 629
    .line 630
    move/from16 v11, v22

    .line 631
    .line 632
    const/16 v12, 0x2000

    .line 633
    .line 634
    :goto_12
    add-int/lit8 v7, v7, 0x1

    .line 635
    .line 636
    move-object/from16 v20, v4

    .line 637
    .line 638
    move/from16 v22, v11

    .line 639
    .line 640
    goto :goto_10

    .line 641
    :cond_1e
    const/4 v6, 0x2

    .line 642
    if-ne v14, v6, :cond_20

    .line 643
    .line 644
    iget-boolean v0, v2, LA3/G;->m:Z

    .line 645
    .line 646
    if-nez v0, :cond_1f

    .line 647
    .line 648
    iget-object v0, v2, LA3/G;->k:Lq3/l;

    .line 649
    .line 650
    invoke-interface {v0}, Lq3/l;->i()V

    .line 651
    .line 652
    .line 653
    const/4 v7, 0x0

    .line 654
    iput v7, v2, LA3/G;->l:I

    .line 655
    .line 656
    const/4 v8, 0x1

    .line 657
    iput-boolean v8, v2, LA3/G;->m:Z

    .line 658
    .line 659
    return-void

    .line 660
    :cond_1f
    move-object/from16 v0, p0

    .line 661
    .line 662
    goto :goto_14

    .line 663
    :cond_20
    move-object/from16 v0, p0

    .line 664
    .line 665
    const/4 v7, 0x0

    .line 666
    const/4 v8, 0x1

    .line 667
    iget v1, v0, LA3/F;->b:I

    .line 668
    .line 669
    invoke-virtual {v3, v1}, Landroid/util/SparseArray;->remove(I)V

    .line 670
    .line 671
    .line 672
    if-ne v14, v8, :cond_21

    .line 673
    .line 674
    move v6, v7

    .line 675
    goto :goto_13

    .line 676
    :cond_21
    iget v1, v2, LA3/G;->l:I

    .line 677
    .line 678
    add-int/lit8 v6, v1, -0x1

    .line 679
    .line 680
    :goto_13
    iput v6, v2, LA3/G;->l:I

    .line 681
    .line 682
    if-nez v6, :cond_22

    .line 683
    .line 684
    iget-object v1, v2, LA3/G;->k:Lq3/l;

    .line 685
    .line 686
    invoke-interface {v1}, Lq3/l;->i()V

    .line 687
    .line 688
    .line 689
    iput-boolean v8, v2, LA3/G;->m:Z

    .line 690
    .line 691
    :cond_22
    :goto_14
    return-void
    .line 692
    .line 693
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
.end method

.method public d(Landroid/view/View;IZ)V
    .locals 3

    .line 1
    iget-object v0, p0, LA3/F;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lo1/f;

    .line 4
    .line 5
    iget-object v0, v0, Lo1/f;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 8
    .line 9
    if-gez p2, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p0, p2}, LA3/F;->j(I)I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    :goto_0
    iget-object v1, p0, LA3/F;->d:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v1, LF0/h;

    .line 23
    .line 24
    invoke-virtual {v1, p2, p3}, LF0/h;->J(IZ)V

    .line 25
    .line 26
    .line 27
    if-eqz p3, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0, p1}, LA3/F;->m(Landroid/view/View;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-virtual {v0, p1, p2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;I)V

    .line 33
    .line 34
    .line 35
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->N(Landroid/view/View;)LF0/r0;

    .line 36
    .line 37
    .line 38
    move-result-object p2

    .line 39
    iget-object p3, v0, Landroidx/recyclerview/widget/RecyclerView;->m:LF0/S;

    .line 40
    .line 41
    if-eqz p3, :cond_2

    .line 42
    .line 43
    if-eqz p2, :cond_2

    .line 44
    .line 45
    invoke-virtual {p3, p2}, LF0/S;->k(LF0/r0;)V

    .line 46
    .line 47
    .line 48
    :cond_2
    iget-object p2, v0, Landroidx/recyclerview/widget/RecyclerView;->C:Ljava/util/ArrayList;

    .line 49
    .line 50
    if-eqz p2, :cond_4

    .line 51
    .line 52
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    .line 53
    .line 54
    .line 55
    move-result p2

    .line 56
    add-int/lit8 p2, p2, -0x1

    .line 57
    .line 58
    :goto_1
    if-ltz p2, :cond_4

    .line 59
    .line 60
    iget-object p3, v0, Landroidx/recyclerview/widget/RecyclerView;->C:Ljava/util/ArrayList;

    .line 61
    .line 62
    invoke-virtual {p3, p2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 63
    .line 64
    .line 65
    move-result-object p3

    .line 66
    check-cast p3, Ld1/g;

    .line 67
    .line 68
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 72
    .line 73
    .line 74
    move-result-object p3

    .line 75
    check-cast p3, LF0/c0;

    .line 76
    .line 77
    iget v1, p3, Landroid/view/ViewGroup$MarginLayoutParams;->width:I

    .line 78
    .line 79
    const/4 v2, -0x1

    .line 80
    if-ne v1, v2, :cond_3

    .line 81
    .line 82
    iget p3, p3, Landroid/view/ViewGroup$MarginLayoutParams;->height:I

    .line 83
    .line 84
    if-ne p3, v2, :cond_3

    .line 85
    .line 86
    add-int/lit8 p2, p2, -0x1

    .line 87
    .line 88
    goto :goto_1

    .line 89
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 90
    .line 91
    const-string p2, "Pages must fill the whole ViewPager2 (use match_parent)"

    .line 92
    .line 93
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 94
    .line 95
    .line 96
    throw p1

    .line 97
    :cond_4
    return-void
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

.method public e(Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;Z)V
    .locals 3

    .line 1
    iget-object v0, p0, LA3/F;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lo1/f;

    .line 4
    .line 5
    iget-object v0, v0, Lo1/f;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 8
    .line 9
    if-gez p2, :cond_0

    .line 10
    .line 11
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 12
    .line 13
    .line 14
    move-result p2

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    invoke-virtual {p0, p2}, LA3/F;->j(I)I

    .line 17
    .line 18
    .line 19
    move-result p2

    .line 20
    :goto_0
    iget-object v1, p0, LA3/F;->d:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v1, LF0/h;

    .line 23
    .line 24
    invoke-virtual {v1, p2, p4}, LF0/h;->J(IZ)V

    .line 25
    .line 26
    .line 27
    if-eqz p4, :cond_1

    .line 28
    .line 29
    invoke-virtual {p0, p1}, LA3/F;->m(Landroid/view/View;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->N(Landroid/view/View;)LF0/r0;

    .line 33
    .line 34
    .line 35
    move-result-object p4

    .line 36
    if-eqz p4, :cond_5

    .line 37
    .line 38
    invoke-virtual {p4}, LF0/r0;->k()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    if-nez v1, :cond_3

    .line 43
    .line 44
    invoke-virtual {p4}, LF0/r0;->p()Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_2

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 52
    .line 53
    new-instance p2, Ljava/lang/StringBuilder;

    .line 54
    .line 55
    const-string p3, "Called attach on a child which is not detached: "

    .line 56
    .line 57
    invoke-direct {p2, p3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    invoke-virtual {p2, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-static {v0, p2}, LA0/a;->j(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 64
    .line 65
    .line 66
    move-result-object p2

    .line 67
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw p1

    .line 71
    :cond_3
    :goto_1
    sget-boolean v1, Landroidx/recyclerview/widget/RecyclerView;->b1:Z

    .line 72
    .line 73
    if-eqz v1, :cond_4

    .line 74
    .line 75
    new-instance v1, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    const-string v2, "reAttach "

    .line 78
    .line 79
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 86
    .line 87
    .line 88
    move-result-object v1

    .line 89
    const-string v2, "RecyclerView"

    .line 90
    .line 91
    invoke-static {v2, v1}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 92
    .line 93
    .line 94
    :cond_4
    iget v1, p4, LF0/r0;->j:I

    .line 95
    .line 96
    and-int/lit16 v1, v1, -0x101

    .line 97
    .line 98
    iput v1, p4, LF0/r0;->j:I

    .line 99
    .line 100
    goto :goto_2

    .line 101
    :cond_5
    sget-boolean p4, Landroidx/recyclerview/widget/RecyclerView;->a1:Z

    .line 102
    .line 103
    if-nez p4, :cond_6

    .line 104
    .line 105
    :goto_2
    invoke-static {v0, p1, p2, p3}, Landroidx/recyclerview/widget/RecyclerView;->a(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/View;ILandroid/view/ViewGroup$LayoutParams;)V

    .line 106
    .line 107
    .line 108
    return-void

    .line 109
    :cond_6
    new-instance p3, Ljava/lang/IllegalArgumentException;

    .line 110
    .line 111
    new-instance p4, Ljava/lang/StringBuilder;

    .line 112
    .line 113
    const-string v1, "No ViewHolder found for child: "

    .line 114
    .line 115
    invoke-direct {p4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 116
    .line 117
    .line 118
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 119
    .line 120
    .line 121
    const-string p1, ", index: "

    .line 122
    .line 123
    invoke-virtual {p4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 124
    .line 125
    .line 126
    invoke-virtual {p4, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 127
    .line 128
    .line 129
    invoke-static {v0, p4}, LA0/a;->j(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 130
    .line 131
    .line 132
    move-result-object p1

    .line 133
    invoke-direct {p3, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 134
    .line 135
    .line 136
    throw p3
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

.method public f(I)V
    .locals 4

    .line 1
    invoke-virtual {p0, p1}, LA3/F;->j(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget-object v0, p0, LA3/F;->d:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, LF0/h;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, LF0/h;->K(I)Z

    .line 10
    .line 11
    .line 12
    iget-object v0, p0, LA3/F;->c:Ljava/lang/Object;

    .line 13
    .line 14
    check-cast v0, Lo1/f;

    .line 15
    .line 16
    iget-object v0, v0, Lo1/f;->b:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 19
    .line 20
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    if-eqz v1, :cond_3

    .line 25
    .line 26
    invoke-static {v1}, Landroidx/recyclerview/widget/RecyclerView;->N(Landroid/view/View;)LF0/r0;

    .line 27
    .line 28
    .line 29
    move-result-object v1

    .line 30
    if-eqz v1, :cond_4

    .line 31
    .line 32
    invoke-virtual {v1}, LF0/r0;->k()Z

    .line 33
    .line 34
    .line 35
    move-result v2

    .line 36
    if-eqz v2, :cond_1

    .line 37
    .line 38
    invoke-virtual {v1}, LF0/r0;->p()Z

    .line 39
    .line 40
    .line 41
    move-result v2

    .line 42
    if-eqz v2, :cond_0

    .line 43
    .line 44
    goto :goto_0

    .line 45
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 46
    .line 47
    new-instance v2, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    const-string v3, "called detach on an already detached child "

    .line 50
    .line 51
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-static {v0, v2}, LA0/a;->j(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    move-result-object v0

    .line 61
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    throw p1

    .line 65
    :cond_1
    :goto_0
    sget-boolean v2, Landroidx/recyclerview/widget/RecyclerView;->b1:Z

    .line 66
    .line 67
    if-eqz v2, :cond_2

    .line 68
    .line 69
    new-instance v2, Ljava/lang/StringBuilder;

    .line 70
    .line 71
    const-string v3, "tmpDetach "

    .line 72
    .line 73
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 80
    .line 81
    .line 82
    move-result-object v2

    .line 83
    const-string v3, "RecyclerView"

    .line 84
    .line 85
    invoke-static {v3, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;)I

    .line 86
    .line 87
    .line 88
    :cond_2
    const/16 v2, 0x100

    .line 89
    .line 90
    invoke-virtual {v1, v2}, LF0/r0;->a(I)V

    .line 91
    .line 92
    .line 93
    goto :goto_1

    .line 94
    :cond_3
    sget-boolean v1, Landroidx/recyclerview/widget/RecyclerView;->a1:Z

    .line 95
    .line 96
    if-nez v1, :cond_5

    .line 97
    .line 98
    :cond_4
    :goto_1
    invoke-static {v0, p1}, Landroidx/recyclerview/widget/RecyclerView;->c(Landroidx/recyclerview/widget/RecyclerView;I)V

    .line 99
    .line 100
    .line 101
    return-void

    .line 102
    :cond_5
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 103
    .line 104
    new-instance v2, Ljava/lang/StringBuilder;

    .line 105
    .line 106
    const-string v3, "No view at offset "

    .line 107
    .line 108
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 112
    .line 113
    .line 114
    invoke-static {v0, v2}, LA0/a;->j(Landroidx/recyclerview/widget/RecyclerView;Ljava/lang/StringBuilder;)Ljava/lang/String;

    .line 115
    .line 116
    .line 117
    move-result-object p1

    .line 118
    invoke-direct {v1, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    throw v1
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

.method public g(Ljava/lang/String;)I
    .locals 1

    .line 1
    iget v0, p0, LA3/F;->b:I

    .line 2
    .line 3
    invoke-static {v0, p1}, Landroid/opengl/GLES20;->glGetAttribLocation(ILjava/lang/String;)I

    .line 4
    .line 5
    .line 6
    move-result p1

    .line 7
    invoke-static {p1}, Landroid/opengl/GLES20;->glEnableVertexAttribArray(I)V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Ll4/a;->i()V

    .line 11
    .line 12
    .line 13
    return p1
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

.method public h(I)Landroid/view/View;
    .locals 1

    .line 1
    invoke-virtual {p0, p1}, LA3/F;->j(I)I

    .line 2
    .line 3
    .line 4
    move-result p1

    .line 5
    iget-object v0, p0, LA3/F;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Lo1/f;

    .line 8
    .line 9
    iget-object v0, v0, Lo1/f;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 12
    .line 13
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    return-object p1
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

.method public i()I
    .locals 2

    .line 1
    iget-object v0, p0, LA3/F;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lo1/f;

    .line 4
    .line 5
    iget-object v0, v0, Lo1/f;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    iget-object v1, p0, LA3/F;->e:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v1, Ljava/util/ArrayList;

    .line 16
    .line 17
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    sub-int/2addr v0, v1

    .line 22
    return v0
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

.method public j(I)I
    .locals 5

    .line 1
    const/4 v0, -0x1

    .line 2
    if-gez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    iget-object v1, p0, LA3/F;->c:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v1, Lo1/f;

    .line 8
    .line 9
    iget-object v1, v1, Lo1/f;->b:Ljava/lang/Object;

    .line 10
    .line 11
    check-cast v1, Landroidx/recyclerview/widget/RecyclerView;

    .line 12
    .line 13
    invoke-virtual {v1}, Landroid/view/ViewGroup;->getChildCount()I

    .line 14
    .line 15
    .line 16
    move-result v1

    .line 17
    move v2, p1

    .line 18
    :goto_0
    if-ge v2, v1, :cond_3

    .line 19
    .line 20
    iget-object v3, p0, LA3/F;->d:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v3, LF0/h;

    .line 23
    .line 24
    invoke-virtual {v3, v2}, LF0/h;->G(I)I

    .line 25
    .line 26
    .line 27
    move-result v4

    .line 28
    sub-int v4, v2, v4

    .line 29
    .line 30
    sub-int v4, p1, v4

    .line 31
    .line 32
    if-nez v4, :cond_2

    .line 33
    .line 34
    :goto_1
    invoke-virtual {v3, v2}, LF0/h;->I(I)Z

    .line 35
    .line 36
    .line 37
    move-result p1

    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    add-int/lit8 v2, v2, 0x1

    .line 41
    .line 42
    goto :goto_1

    .line 43
    :cond_1
    return v2

    .line 44
    :cond_2
    add-int/2addr v2, v4

    .line 45
    goto :goto_0

    .line 46
    :cond_3
    return v0
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

.method public k(I)Landroid/view/View;
    .locals 1

    .line 1
    iget-object v0, p0, LA3/F;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lo1/f;

    .line 4
    .line 5
    iget-object v0, v0, Lo1/f;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 8
    .line 9
    invoke-virtual {v0, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    return-object p1
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

.method public l()I
    .locals 1

    .line 1
    iget-object v0, p0, LA3/F;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lo1/f;

    .line 4
    .line 5
    iget-object v0, v0, Lo1/f;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    return v0
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

.method public m(Landroid/view/View;)V
    .locals 4

    .line 1
    iget-object v0, p0, LA3/F;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    iget-object v0, p0, LA3/F;->c:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast v0, Lo1/f;

    .line 11
    .line 12
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->N(Landroid/view/View;)LF0/r0;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    if-eqz p1, :cond_2

    .line 17
    .line 18
    iget v1, p1, LF0/r0;->q:I

    .line 19
    .line 20
    const/4 v2, -0x1

    .line 21
    iget-object v3, p1, LF0/r0;->a:Landroid/view/View;

    .line 22
    .line 23
    if-eq v1, v2, :cond_0

    .line 24
    .line 25
    iput v1, p1, LF0/r0;->p:I

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :cond_0
    invoke-virtual {v3}, Landroid/view/View;->getImportantForAccessibility()I

    .line 29
    .line 30
    .line 31
    move-result v1

    .line 32
    iput v1, p1, LF0/r0;->p:I

    .line 33
    .line 34
    :goto_0
    iget-object v0, v0, Lo1/f;->b:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 37
    .line 38
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->Q()Z

    .line 39
    .line 40
    .line 41
    move-result v1

    .line 42
    const/4 v2, 0x4

    .line 43
    if-eqz v1, :cond_1

    .line 44
    .line 45
    iput v2, p1, LF0/r0;->q:I

    .line 46
    .line 47
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->S0:Ljava/util/ArrayList;

    .line 48
    .line 49
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 50
    .line 51
    .line 52
    return-void

    .line 53
    :cond_1
    invoke-virtual {v3, v2}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 54
    .line 55
    .line 56
    :cond_2
    return-void
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

.method public n(I)V
    .locals 5

    .line 1
    iget-object v0, p0, LA3/F;->c:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Lo1/f;

    .line 4
    .line 5
    iget v1, p0, LA3/F;->b:I

    .line 6
    .line 7
    const/4 v2, 0x1

    .line 8
    if-eq v1, v2, :cond_3

    .line 9
    .line 10
    const/4 v3, 0x2

    .line 11
    if-eq v1, v3, :cond_2

    .line 12
    .line 13
    const/4 v1, 0x0

    .line 14
    const/4 v3, 0x0

    .line 15
    :try_start_0
    invoke-virtual {p0, p1}, LA3/F;->j(I)I

    .line 16
    .line 17
    .line 18
    move-result p1

    .line 19
    iget-object v4, v0, Lo1/f;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast v4, Landroidx/recyclerview/widget/RecyclerView;

    .line 22
    .line 23
    invoke-virtual {v4, p1}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 24
    .line 25
    .line 26
    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    if-nez v4, :cond_0

    .line 28
    .line 29
    :goto_0
    iput v3, p0, LA3/F;->b:I

    .line 30
    .line 31
    iput-object v1, p0, LA3/F;->f:Ljava/lang/Object;

    .line 32
    .line 33
    return-void

    .line 34
    :cond_0
    :try_start_1
    iput v2, p0, LA3/F;->b:I

    .line 35
    .line 36
    iput-object v4, p0, LA3/F;->f:Ljava/lang/Object;

    .line 37
    .line 38
    iget-object v2, p0, LA3/F;->d:Ljava/lang/Object;

    .line 39
    .line 40
    check-cast v2, LF0/h;

    .line 41
    .line 42
    invoke-virtual {v2, p1}, LF0/h;->K(I)Z

    .line 43
    .line 44
    .line 45
    move-result v2

    .line 46
    if-eqz v2, :cond_1

    .line 47
    .line 48
    invoke-virtual {p0, v4}, LA3/F;->o(Landroid/view/View;)V

    .line 49
    .line 50
    .line 51
    goto :goto_1

    .line 52
    :catchall_0
    move-exception p1

    .line 53
    goto :goto_2

    .line 54
    :cond_1
    :goto_1
    invoke-virtual {v0, p1}, Lo1/f;->K(I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 55
    .line 56
    .line 57
    goto :goto_0

    .line 58
    :goto_2
    iput v3, p0, LA3/F;->b:I

    .line 59
    .line 60
    iput-object v1, p0, LA3/F;->f:Ljava/lang/Object;

    .line 61
    .line 62
    throw p1

    .line 63
    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 64
    .line 65
    const-string v0, "Cannot call removeView(At) within removeViewIfHidden"

    .line 66
    .line 67
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    throw p1

    .line 71
    :cond_3
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 72
    .line 73
    const-string v0, "Cannot call removeView(At) within removeView(At)"

    .line 74
    .line 75
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    throw p1
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

.method public o(Landroid/view/View;)V
    .locals 3

    .line 1
    iget-object v0, p0, LA3/F;->e:Ljava/lang/Object;

    .line 2
    .line 3
    check-cast v0, Ljava/util/ArrayList;

    .line 4
    .line 5
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 6
    .line 7
    .line 8
    move-result v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    iget-object v0, p0, LA3/F;->c:Ljava/lang/Object;

    .line 12
    .line 13
    check-cast v0, Lo1/f;

    .line 14
    .line 15
    invoke-static {p1}, Landroidx/recyclerview/widget/RecyclerView;->N(Landroid/view/View;)LF0/r0;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    if-eqz p1, :cond_1

    .line 20
    .line 21
    iget v1, p1, LF0/r0;->p:I

    .line 22
    .line 23
    iget-object v0, v0, Lo1/f;->b:Ljava/lang/Object;

    .line 24
    .line 25
    check-cast v0, Landroidx/recyclerview/widget/RecyclerView;

    .line 26
    .line 27
    invoke-virtual {v0}, Landroidx/recyclerview/widget/RecyclerView;->Q()Z

    .line 28
    .line 29
    .line 30
    move-result v2

    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    iput v1, p1, LF0/r0;->q:I

    .line 34
    .line 35
    iget-object v0, v0, Landroidx/recyclerview/widget/RecyclerView;->S0:Ljava/util/ArrayList;

    .line 36
    .line 37
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_0
    iget-object v0, p1, LF0/r0;->a:Landroid/view/View;

    .line 42
    .line 43
    invoke-virtual {v0, v1}, Landroid/view/View;->setImportantForAccessibility(I)V

    .line 44
    .line 45
    .line 46
    :goto_0
    const/4 v0, 0x0

    .line 47
    iput v0, p1, LF0/r0;->p:I

    .line 48
    .line 49
    :cond_1
    return-void
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

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget v0, p0, LA3/F;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    return-object v0

    .line 11
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    iget-object v1, p0, LA3/F;->d:Ljava/lang/Object;

    .line 17
    .line 18
    check-cast v1, LF0/h;

    .line 19
    .line 20
    invoke-virtual {v1}, LF0/h;->toString()Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v1

    .line 24
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 25
    .line 26
    .line 27
    const-string v1, ", hidden list:"

    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    iget-object v1, p0, LA3/F;->e:Ljava/lang/Object;

    .line 33
    .line 34
    check-cast v1, Ljava/util/ArrayList;

    .line 35
    .line 36
    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object v0

    .line 47
    return-object v0

    .line 48
    nop

    .line 49
    :pswitch_data_0
    .packed-switch 0x2
        :pswitch_0
    .end packed-switch
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
.end method
