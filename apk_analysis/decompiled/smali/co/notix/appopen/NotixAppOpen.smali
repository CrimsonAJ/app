.class public interface abstract Lco/notix/appopen/NotixAppOpen;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/notix/appopen/NotixAppOpen$Companion;,
        Lco/notix/appopen/NotixAppOpen$DefaultImpls;
    }
.end annotation


# static fields
.field public static final Companion:Lco/notix/appopen/NotixAppOpen$Companion;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Lco/notix/appopen/NotixAppOpen$Companion;->$$INSTANCE:Lco/notix/appopen/NotixAppOpen$Companion;

    sput-object v0, Lco/notix/appopen/NotixAppOpen;->Companion:Lco/notix/appopen/NotixAppOpen$Companion;

    return-void
.end method


# virtual methods
.method public abstract createLoader(J)Lco/notix/appopen/AppOpenLoader;
    .annotation build Landroidx/annotation/Keep;
    .end annotation
.end method

.method public abstract createLoader(JLco/notix/domain/RequestVars;)Lco/notix/appopen/AppOpenLoader;
    .annotation build Landroidx/annotation/Keep;
    .end annotation
.end method

.method public abstract createLoader(JLco/notix/domain/RequestVars;Ljava/lang/Integer;)Lco/notix/appopen/AppOpenLoader;
    .annotation build Landroidx/annotation/Keep;
    .end annotation
.end method

.method public abstract createLoader(JLjava/lang/Integer;)Lco/notix/appopen/AppOpenLoader;
    .annotation build Landroidx/annotation/Keep;
    .end annotation
.end method

.method public abstract doOnApplicationOpen(LO7/l;)V
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LO7/l;",
            ")V"
        }
    .end annotation
.end method

.method public abstract doOnApplicationOpen(LO7/l;J)V
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "LO7/l;",
            "J)V"
        }
    .end annotation
.end method

.method public abstract ignoreNextApplicationOpen()V
    .annotation build Landroidx/annotation/Keep;
    .end annotation
.end method

.method public abstract show(Lco/notix/appopen/AppOpenData;)V
    .annotation build Landroidx/annotation/Keep;
    .end annotation
.end method

.method public abstract show(Lco/notix/appopen/AppOpenData;LO7/a;LO7/a;LO7/l;)V
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/notix/appopen/AppOpenData;",
            "LO7/a;",
            "LO7/a;",
            "LO7/l;",
            ")V"
        }
    .end annotation
.end method

.method public abstract startAutoShow(Lco/notix/appopen/AppOpenLoader;)V
    .annotation build Landroidx/annotation/Keep;
    .end annotation
.end method

.method public abstract startAutoShow(Lco/notix/appopen/AppOpenLoader;JJLO7/a;LO7/a;LO7/l;)V
    .annotation build Landroidx/annotation/Keep;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lco/notix/appopen/AppOpenLoader;",
            "JJ",
            "LO7/a;",
            "LO7/a;",
            "LO7/l;",
            ")V"
        }
    .end annotation
.end method

.method public abstract stopAutoShow()V
    .annotation build Landroidx/annotation/Keep;
    .end annotation
.end method
