.class public final Lco/notix/a6;
.super LG7/j;
.source "SourceFile"

# interfaces
.implements LO7/p;


# instance fields
.field public final synthetic a:Lco/notix/j6;


# direct methods
.method public constructor <init>(Lco/notix/j6;LE7/d;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lco/notix/a6;->a:Lco/notix/j6;

    .line 2
    .line 3
    const/4 p1, 0x2

    .line 4
    invoke-direct {p0, p1, p2}, LG7/j;-><init>(ILE7/d;)V

    .line 5
    .line 6
    .line 7
    return-void
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
.method public final create(Ljava/lang/Object;LE7/d;)LE7/d;
    .locals 1

    .line 1
    new-instance p1, Lco/notix/a6;

    .line 2
    .line 3
    iget-object v0, p0, Lco/notix/a6;->a:Lco/notix/j6;

    .line 4
    .line 5
    invoke-direct {p1, v0, p2}, Lco/notix/a6;-><init>(Lco/notix/j6;LE7/d;)V

    .line 6
    .line 7
    .line 8
    return-object p1
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

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, LY7/z;

    .line 2
    .line 3
    check-cast p2, LE7/d;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lco/notix/a6;->create(Ljava/lang/Object;LE7/d;)LE7/d;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lco/notix/a6;

    .line 10
    .line 11
    sget-object p2, LA7/n;->a:LA7/n;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lco/notix/a6;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lco/notix/a6;->a:Lco/notix/j6;

    .line 5
    .line 6
    sget v0, Lco/notix/j6;->v:I

    .line 7
    .line 8
    iget-object p1, p1, Lco/notix/j6;->k:LA7/e;

    .line 9
    .line 10
    invoke-interface {p1}, LA7/e;->getValue()Ljava/lang/Object;

    .line 11
    .line 12
    .line 13
    move-result-object p1

    .line 14
    const-string v0, "<get-image>(...)"

    .line 15
    .line 16
    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    .line 19
    check-cast p1, Landroid/widget/ImageView;

    .line 20
    .line 21
    iget-object v0, p0, Lco/notix/a6;->a:Lco/notix/j6;

    .line 22
    .line 23
    invoke-virtual {v0}, Lco/notix/zb;->c()Lco/notix/g;

    .line 24
    .line 25
    .line 26
    move-result-object v0

    .line 27
    check-cast v0, Lco/notix/i;

    .line 28
    .line 29
    iget-object v0, v0, Lco/notix/i;->c:Landroid/graphics/Bitmap;

    .line 30
    .line 31
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V

    .line 32
    .line 33
    .line 34
    iget-object p1, p0, Lco/notix/a6;->a:Lco/notix/j6;

    .line 35
    .line 36
    invoke-virtual {p1}, Lco/notix/zb;->c()Lco/notix/g;

    .line 37
    .line 38
    .line 39
    move-result-object v0

    .line 40
    check-cast v0, Lco/notix/i;

    .line 41
    .line 42
    iget-object v0, v0, Lco/notix/i;->c:Landroid/graphics/Bitmap;

    .line 43
    .line 44
    invoke-static {p1, v0}, Lco/notix/j6;->a(Lco/notix/j6;Landroid/graphics/Bitmap;)V

    .line 45
    .line 46
    .line 47
    iget-object p1, p0, Lco/notix/a6;->a:Lco/notix/j6;

    .line 48
    .line 49
    invoke-virtual {p1}, Lco/notix/zb;->c()Lco/notix/g;

    .line 50
    .line 51
    .line 52
    move-result-object v0

    .line 53
    check-cast v0, Lco/notix/i;

    .line 54
    .line 55
    iget-object v0, v0, Lco/notix/i;->c:Landroid/graphics/Bitmap;

    .line 56
    .line 57
    new-instance v1, Lco/notix/b6;

    .line 58
    .line 59
    invoke-direct {v1, p1}, Lco/notix/b6;-><init>(Lco/notix/j6;)V

    .line 60
    .line 61
    .line 62
    invoke-static {p1, v0, v1}, Lco/notix/q8;->a(Lco/notix/j6;Landroid/graphics/Bitmap;Lco/notix/b6;)V

    .line 63
    .line 64
    .line 65
    iget-object p1, p0, Lco/notix/a6;->a:Lco/notix/j6;

    .line 66
    .line 67
    invoke-virtual {p1}, Lco/notix/zb;->c()Lco/notix/g;

    .line 68
    .line 69
    .line 70
    move-result-object v0

    .line 71
    check-cast v0, Lco/notix/i;

    .line 72
    .line 73
    iget-object v0, v0, Lco/notix/i;->h:Ljava/lang/String;

    .line 74
    .line 75
    invoke-virtual {p1, v0}, Lco/notix/zb;->a(Ljava/lang/String;)V

    .line 76
    .line 77
    .line 78
    sget-object p1, LA7/n;->a:LA7/n;

    .line 79
    .line 80
    return-object p1
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
