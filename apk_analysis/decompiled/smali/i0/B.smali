.class public final Li0/B;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/LayoutInflater$Factory2;


# instance fields
.field public final a:Li0/M;


# direct methods
.method public constructor <init>(Li0/M;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Li0/B;->a:Li0/M;

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


# virtual methods
.method public final onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 10

    .line 2
    const-class v0, Landroidx/fragment/app/FragmentContainerView;

    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    iget-object v1, p0, Li0/B;->a:Li0/M;

    if-eqz v0, :cond_0

    .line 3
    new-instance p1, Landroidx/fragment/app/FragmentContainerView;

    invoke-direct {p1, p3, p4, v1}, Landroidx/fragment/app/FragmentContainerView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;Li0/M;)V

    return-object p1

    .line 4
    :cond_0
    const-string v0, "fragment"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    const/4 v0, 0x0

    if-nez p2, :cond_1

    goto/16 :goto_4

    .line 5
    :cond_1
    const-string p2, "class"

    invoke-interface {p4, v0, p2}, Landroid/util/AttributeSet;->getAttributeValue(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 6
    sget-object v2, Lh0/a;->a:[I

    invoke-virtual {p3, p4, v2}, Landroid/content/Context;->obtainStyledAttributes(Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object v2

    const/4 v3, 0x0

    if-nez p2, :cond_2

    .line 7
    invoke-virtual {v2, v3}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object p2

    :cond_2
    const/4 v4, 0x1

    const/4 v5, -0x1

    .line 8
    invoke-virtual {v2, v4, v5}, Landroid/content/res/TypedArray;->getResourceId(II)I

    move-result v6

    const/4 v7, 0x2

    .line 9
    invoke-virtual {v2, v7}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v8

    .line 10
    invoke-virtual {v2}, Landroid/content/res/TypedArray;->recycle()V

    if-eqz p2, :cond_11

    .line 11
    invoke-virtual {p3}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v2

    .line 12
    :try_start_0
    invoke-static {v2, p2}, Li0/F;->b(Ljava/lang/ClassLoader;Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v2

    .line 13
    const-class v9, Li0/v;

    invoke-virtual {v9, v2}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v2
    :try_end_0
    .catch Ljava/lang/ClassNotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move v2, v3

    :goto_0
    if-nez v2, :cond_3

    goto/16 :goto_4

    :cond_3
    if-eqz p1, :cond_4

    .line 14
    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result v3

    :cond_4
    if-ne v3, v5, :cond_6

    if-ne v6, v5, :cond_6

    if-eqz v8, :cond_5

    goto :goto_1

    .line 15
    :cond_5
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p4}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, ": Must specify unique android:id, android:tag, or have a parent with an id for "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_6
    :goto_1
    if-eq v6, v5, :cond_7

    .line 16
    invoke-virtual {v1, v6}, Li0/M;->B(I)Li0/v;

    move-result-object v0

    :cond_7
    if-nez v0, :cond_8

    if-eqz v8, :cond_8

    .line 17
    invoke-virtual {v1, v8}, Li0/M;->C(Ljava/lang/String;)Li0/v;

    move-result-object v0

    :cond_8
    if-nez v0, :cond_9

    if-eq v3, v5, :cond_9

    .line 18
    invoke-virtual {v1, v3}, Li0/M;->B(I)Li0/v;

    move-result-object v0

    .line 19
    :cond_9
    const-string v2, "Fragment "

    const-string v5, "FragmentManager"

    if-nez v0, :cond_b

    .line 20
    invoke-virtual {v1}, Li0/M;->E()Li0/F;

    move-result-object v0

    .line 21
    invoke-virtual {p3}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    .line 22
    invoke-virtual {v0, p2}, Li0/F;->a(Ljava/lang/String;)Li0/v;

    move-result-object v0

    .line 23
    iput-boolean v4, v0, Li0/v;->n:Z

    if-eqz v6, :cond_a

    move p3, v6

    goto :goto_2

    :cond_a
    move p3, v3

    .line 24
    :goto_2
    iput p3, v0, Li0/v;->w:I

    .line 25
    iput v3, v0, Li0/v;->x:I

    .line 26
    iput-object v8, v0, Li0/v;->y:Ljava/lang/String;

    .line 27
    iput-boolean v4, v0, Li0/v;->o:Z

    .line 28
    iput-object v1, v0, Li0/v;->s:Li0/M;

    .line 29
    iget-object p3, v1, Li0/M;->u:Li0/x;

    .line 30
    iput-object p3, v0, Li0/v;->t:Li0/x;

    .line 31
    iget-object p3, p3, Li0/x;->o:Li0/y;

    .line 32
    iget-object v3, v0, Li0/v;->b:Landroid/os/Bundle;

    invoke-virtual {v0, p3, p4, v3}, Li0/v;->M(Landroid/content/Context;Landroid/util/AttributeSet;Landroid/os/Bundle;)V

    .line 33
    invoke-virtual {v1, v0}, Li0/M;->a(Li0/v;)Li0/U;

    move-result-object p3

    .line 34
    invoke-static {v7}, Li0/M;->H(I)Z

    move-result p4

    if-eqz p4, :cond_c

    .line 35
    new-instance p4, Ljava/lang/StringBuilder;

    invoke-direct {p4, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " has been inflated via the <fragment> tag: id=0x"

    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    .line 37
    invoke-static {v5, p4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    goto :goto_3

    .line 38
    :cond_b
    iget-boolean p3, v0, Li0/v;->o:Z

    if-nez p3, :cond_10

    .line 39
    iput-boolean v4, v0, Li0/v;->o:Z

    .line 40
    iput-object v1, v0, Li0/v;->s:Li0/M;

    .line 41
    iget-object p3, v1, Li0/M;->u:Li0/x;

    .line 42
    iput-object p3, v0, Li0/v;->t:Li0/x;

    .line 43
    iget-object p3, p3, Li0/x;->o:Li0/y;

    .line 44
    iget-object v3, v0, Li0/v;->b:Landroid/os/Bundle;

    invoke-virtual {v0, p3, p4, v3}, Li0/v;->M(Landroid/content/Context;Landroid/util/AttributeSet;Landroid/os/Bundle;)V

    .line 45
    invoke-virtual {v1, v0}, Li0/M;->f(Li0/v;)Li0/U;

    move-result-object p3

    .line 46
    invoke-static {v7}, Li0/M;->H(I)Z

    move-result p4

    if-eqz p4, :cond_c

    .line 47
    new-instance p4, Ljava/lang/StringBuilder;

    const-string v1, "Retained Fragment "

    invoke-direct {p4, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " has been re-attached via the <fragment> tag: id=0x"

    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p4

    .line 49
    invoke-static {v5, p4}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I

    .line 50
    :cond_c
    :goto_3
    check-cast p1, Landroid/view/ViewGroup;

    sget-object p4, Lj0/d;->a:Lj0/c;

    .line 51
    new-instance p4, Lj0/a;

    .line 52
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v3, "Attempting to use <fragment> tag to add fragment "

    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v3, " to container "

    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 53
    invoke-direct {p4, v0, v1}, Lj0/a;-><init>(Li0/v;Ljava/lang/String;)V

    .line 54
    invoke-static {p4}, Lj0/d;->b(Lj0/a;)V

    .line 55
    invoke-static {v0}, Lj0/d;->a(Li0/v;)Lj0/c;

    move-result-object p4

    .line 56
    invoke-virtual {p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    iput-object p1, v0, Li0/v;->X:Landroid/view/ViewGroup;

    .line 58
    invoke-virtual {p3}, Li0/U;->k()V

    .line 59
    invoke-virtual {p3}, Li0/U;->j()V

    .line 60
    iget-object p1, v0, Li0/v;->Y:Landroid/view/View;

    if-eqz p1, :cond_f

    if-eqz v6, :cond_d

    .line 61
    invoke-virtual {p1, v6}, Landroid/view/View;->setId(I)V

    .line 62
    :cond_d
    iget-object p1, v0, Li0/v;->Y:Landroid/view/View;

    invoke-virtual {p1}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object p1

    if-nez p1, :cond_e

    .line 63
    iget-object p1, v0, Li0/v;->Y:Landroid/view/View;

    invoke-virtual {p1, v8}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 64
    :cond_e
    iget-object p1, v0, Li0/v;->Y:Landroid/view/View;

    new-instance p2, Li0/A;

    invoke-direct {p2, p0, p3}, Li0/A;-><init>(Li0/B;Li0/U;)V

    invoke-virtual {p1, p2}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 65
    iget-object p1, v0, Li0/v;->Y:Landroid/view/View;

    return-object p1

    .line 66
    :cond_f
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p3, " did not create a view."

    .line 67
    invoke-static {v2, p2, p3}, LA0/a;->n(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 68
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    .line 69
    :cond_10
    new-instance p1, Ljava/lang/IllegalArgumentException;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-interface {p4}, Landroid/util/AttributeSet;->getPositionDescription()Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, ": Duplicate id 0x"

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    invoke-static {v6}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, ", tag "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, ", or parent id 0x"

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 71
    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object p4

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p4, " with another fragment for "

    invoke-virtual {p3, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_11
    :goto_4
    return-object v0
.end method

.method public final onCreateView(Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-virtual {p0, v0, p1, p2, p3}, Li0/B;->onCreateView(Landroid/view/View;Ljava/lang/String;Landroid/content/Context;Landroid/util/AttributeSet;)Landroid/view/View;

    move-result-object p1

    return-object p1
.end method
