.class public final Lb2/b;
.super LG7/j;
.source "SourceFile"

# interfaces
.implements LO7/p;


# instance fields
.field public synthetic r:Ljava/lang/Object;

.field public final synthetic s:Lcom/anilab/android/ui/main/HostFragment;


# direct methods
.method public constructor <init>(LE7/d;Lcom/anilab/android/ui/main/HostFragment;)V
    .locals 0

    .line 1
    iput-object p2, p0, Lb2/b;->s:Lcom/anilab/android/ui/main/HostFragment;

    .line 2
    .line 3
    const/4 p2, 0x2

    .line 4
    invoke-direct {p0, p2, p1}, LG7/j;-><init>(ILE7/d;)V

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
    .locals 2

    .line 1
    new-instance v0, Lb2/b;

    .line 2
    .line 3
    iget-object v1, p0, Lb2/b;->s:Lcom/anilab/android/ui/main/HostFragment;

    .line 4
    .line 5
    invoke-direct {v0, p2, v1}, Lb2/b;-><init>(LE7/d;Lcom/anilab/android/ui/main/HostFragment;)V

    .line 6
    .line 7
    .line 8
    iput-object p1, v0, Lb2/b;->r:Ljava/lang/Object;

    .line 9
    .line 10
    return-object v0
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
    check-cast p1, LH2/u;

    .line 2
    .line 3
    check-cast p2, LE7/d;

    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lb2/b;->create(Ljava/lang/Object;LE7/d;)LE7/d;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    check-cast p1, Lb2/b;

    .line 10
    .line 11
    sget-object p2, LA7/n;->a:LA7/n;

    .line 12
    .line 13
    invoke-virtual {p1, p2}, Lb2/b;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 14
    .line 15
    .line 16
    return-object p2
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

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 2
    .line 3
    .line 4
    iget-object p1, p0, Lb2/b;->r:Ljava/lang/Object;

    .line 5
    .line 6
    check-cast p1, LH2/u;

    .line 7
    .line 8
    iget-object v0, p0, Lb2/b;->s:Lcom/anilab/android/ui/main/HostFragment;

    .line 9
    .line 10
    invoke-virtual {v0}, LM1/n;->e0()LW/g;

    .line 11
    .line 12
    .line 13
    move-result-object v1

    .line 14
    check-cast v1, LJ1/S;

    .line 15
    .line 16
    iget-object v1, v1, LJ1/S;->y:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 17
    .line 18
    const-string v2, "layoutContinue"

    .line 19
    .line 20
    invoke-static {v1, v2}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    const/4 v3, 0x0

    .line 24
    if-eqz p1, :cond_0

    .line 25
    .line 26
    move v4, v3

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    const/16 v4, 0x8

    .line 29
    .line 30
    :goto_0
    invoke-virtual {v1, v4}, Landroid/view/View;->setVisibility(I)V

    .line 31
    .line 32
    .line 33
    if-eqz p1, :cond_1

    .line 34
    .line 35
    invoke-virtual {v0}, LM1/n;->e0()LW/g;

    .line 36
    .line 37
    .line 38
    move-result-object v0

    .line 39
    check-cast v0, LJ1/S;

    .line 40
    .line 41
    iget-object v1, v0, LJ1/S;->y:Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 42
    .line 43
    invoke-static {v1, v2}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 47
    .line 48
    .line 49
    iget-object v1, v0, LJ1/S;->A:Landroidx/appcompat/widget/AppCompatTextView;

    .line 50
    .line 51
    iget-object v2, p1, LH2/u;->d:Ljava/lang/String;

    .line 52
    .line 53
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 54
    .line 55
    .line 56
    iget-object v0, v0, LJ1/S;->x:Lcom/google/android/material/imageview/ShapeableImageView;

    .line 57
    .line 58
    const-string v1, "imagePoster"

    .line 59
    .line 60
    invoke-static {v0, v1}, Lkotlin/jvm/internal/h;->d(Ljava/lang/Object;Ljava/lang/String;)V

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 64
    .line 65
    .line 66
    move-result-object v1

    .line 67
    invoke-static {v1}, Lt1/a;->a(Landroid/content/Context;)Lt1/m;

    .line 68
    .line 69
    .line 70
    move-result-object v1

    .line 71
    new-instance v2, LC1/h;

    .line 72
    .line 73
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 74
    .line 75
    .line 76
    move-result-object v3

    .line 77
    invoke-direct {v2, v3}, LC1/h;-><init>(Landroid/content/Context;)V

    .line 78
    .line 79
    .line 80
    iget-object p1, p1, LH2/u;->e:Ljava/lang/String;

    .line 81
    .line 82
    iput-object p1, v2, LC1/h;->c:Ljava/lang/Object;

    .line 83
    .line 84
    invoke-virtual {v2, v0}, LC1/h;->b(Landroid/widget/ImageView;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2}, LC1/h;->a()LC1/i;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-virtual {v1, p1}, Lt1/m;->b(LC1/i;)LC1/k;

    .line 92
    .line 93
    .line 94
    :cond_1
    sget-object p1, LA7/n;->a:LA7/n;

    .line 95
    .line 96
    return-object p1
.end method
